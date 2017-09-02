package src.command

class CeilingFan(var location:String) {
    var speed:Int

    init {
        speed = OFF
    }
    fun high(){
        speed = HIGH
    }

    fun medium(){
        speed = MEDIUM
    }

    fun low(){
        speed = LOW
    }

    fun off(){
        speed = OFF
    }

    companion object {

         val HIGH:Int = 3
         val MEDIUM:Int = 2
         val LOW:Int = 1
         val OFF:Int = 0

    }
}