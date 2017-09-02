package src.command

class GarageCommand(val garageDoor: GarageDoor): Command {
    override fun undo() {
        garageDoor.down()
    }

    override fun execute() {
        garageDoor.up()

    }
}