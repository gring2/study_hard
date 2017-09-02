package src.command

class LightOffCommand(val light: Light): Command {
    override fun execute() {
        light.off()
    }

    override fun undo() {
        light.on()
    }
}