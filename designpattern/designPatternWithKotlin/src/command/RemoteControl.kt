package src.command

class RemoteControl {

    private lateinit var onCommands:Array<Command?>
    private lateinit var offCommands:Array<Command?>
    private lateinit var undo:Command

    init {
            onCommands = arrayOfNulls(7)
            offCommands = arrayOfNulls(7)

    }

    fun setCommand(slot:Int, onCommand: Command, offCommand: Command){
        this.onCommands[slot] = onCommand
        this.offCommands[slot] = offCommand
    }
    fun onButtonWasPressed(slot:Int){
        onCommands[slot]!!.execute()
        undo= (offCommands[slot])!!
    }

    fun offButtonWasPressed(slot: Int){
        offCommands[slot]!!.execute()
        undo= (onCommands[slot])!!

    }

    override fun toString(): String {
        val stringBuff:StringBuffer = StringBuffer()
        stringBuff.append("\n-------- Remote Control ---------${ onCommands.size}\n")
        for (i in 0 until onCommands.size) {
            stringBuff.append("[slot $i ] ${onCommands[i]?.javaClass?.name} " +
                    "     ${offCommands[i]?.javaClass?.name }\n")
        }
        return stringBuff.toString();
    }

    fun undoButtonWasPushed(){
        println()
        println("UNDO PUSHED")
        undo.execute()
    }
}


