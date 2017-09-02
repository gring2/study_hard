package src.command

interface Command  {
    fun execute()
    fun undo()
}