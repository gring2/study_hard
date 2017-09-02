package src.command

class StereoOffCommand(val stereo: Stereo): Command {
    override fun execute() {
        stereo.off()
    }

    override fun undo() {
        stereo.on()
    }
}