package src.composit.duck.observer

interface QuackObservable {

    fun registerObserver(observer: Observer)

    fun notifyObserver()
}