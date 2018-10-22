import os
import subprocess
import docker
import sys

from stream.settings import PROJECT_ROOT, MEDIA_ROOT


class VideoManipulator:
    DIR_NAME = 'videos/'

    def __init__(self):
        pass

    @classmethod
    def render_and_mpdfy(cls, filename):
        rendered_file = cls.__make_renderd_file_on_hisplace(filename)
        return cls.__make_mpd_file(filename, rendered_file)

    @classmethod
    def __make_renderd_file_on_hisplace(cls, filename):
        dir = MEDIA_ROOT + "/" + cls.DIR_NAME + filename + '_folder'
        success = None
        if not os.path.exists(dir):
            os.makedirs(dir, 0o777, False)

        try:
            index_of_extension = filename.find(".")
            filename_with_subfix = filename[:index_of_extension] + "_out" + filename[index_of_extension:]

            result = subprocess.check_output(
                "ffmpeg -i " + MEDIA_ROOT + "/" + cls.DIR_NAME + filename + " -codec:v libx264 "
                                                                            "-profile:v baseline -preset slow -b:v 1000k "
                                                                            "-maxrate 1000k -bufsize 2000k -vf scale=-1:720 "
                                                                            "-threads 0 -codec:a aac -b:a 128k -f mp4  "
                                                                            " -strict experimental " +
                PROJECT_ROOT + "/../media/videos/" + filename_with_subfix
                , shell=True)
            #            result = subprocess.check_output(PROJECT_ROOT+"/../media/videos/example_out.mp4", shell=True)
            success_bytes = b''

            if result == success_bytes:
                success = filename_with_subfix

        except OSError as err:
            print("OS error: {0}".format(err))

        except:
            print("Unexpected error", sys.exc_info()[0])

        return success

    @classmethod
    def __make_mpd_file(cls, folder_prefix, filename):
        client = docker.from_env()

        client.containers.run('google/shaka-packager',
                              command="packager "
                                      "'input=" + '/media/' + filename + ",stream=audio,init_segment=audio_init.mp4,"
                                                                         "segment_template=audio_$Number$.m4s' "
                                                                         "'input=" + '/media/' + filename + ","
                                                                         "stream=video,init_segment=h264_360p_init.mp4, "
                                                                         "segment_template=h264_360p_$Number$.m4s' "
                                                                         "--generate_static_mpd --mpd_output h264.mpd",
                              auto_remove=True,
                              working_dir='/media/' + folder_prefix + '_folder',
                              volumes={
                                  PROJECT_ROOT + '/../media/videos': {'bind': '/media', 'mode': 'rw'}}
                              )
        return cls.DIR_NAME + folder_prefix + '_folder/h264.mpd'
