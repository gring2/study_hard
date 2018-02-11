package src.composit.duck.observer

class QuackLogist:Observer {
    override fun update(duck: QuackObservable) {
        println("Logist ${duck.toString()} just quacked\n")
    }
}