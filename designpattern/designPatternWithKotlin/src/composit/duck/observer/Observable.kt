package src.composit.duck.observer

open class Observable(val duck: QuackObservable):QuackObservable {
    val observers:MutableList<Observer> = ArrayList()
    override fun registerObserver(observer:Observer) {
        observers.add(observer)
    }

    override fun notifyObserver() {
        val ite = observers.iterator()
        while(ite.hasNext()){
            ite.next().update(duck)
        }
    }
}