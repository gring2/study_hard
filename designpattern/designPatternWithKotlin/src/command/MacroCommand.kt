package src.command

class MacroCommand(var commands:Array<Command>): Command {
    override fun undo() {
        for ( i in 0 until commands.size){
            commands[i].undo()
        }
    }

    override fun execute() {
        for ( i in 0 until commands.size){
            commands[i].execute()
        }
    }


}