package src.command

class SimpleRemote() {
   lateinit var slot:Command

    fun buttonWasPressed(){
        slot.execute();
    }
}