package src.command

class Light(val where:String) {

    fun on(){
        println("light on $where")
    }
    fun off(){
        print("light off $where")
    }
}