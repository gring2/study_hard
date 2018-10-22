import os
from django.http import JsonResponse
from django.shortcuts import render

from  django.views import View

from streaming.forms import VideoForm


# Create your views here.
from streaming.manipulation_video.vidoeManipulator import VideoManipulator


class FileUploadForm(View):
    def get(self, request):
        template_name = 'stream/index.html'
        return render(request, template_name)

    def post(self, request):
        form = VideoForm(request.POST, request.FILES)
        data = None
        if form.is_valid():
            video = form.save()
            if os.path.isfile(video.file.path):
                data = {'is_valid': True, 'name': os.path.basename(video.file.name),
                        'url': VideoManipulator.render_and_mpdfy(os.path.basename(video.file.name))}
        else:
            data = {'is_valid': False}
        return JsonResponse(data)

