package src.composit.duck.decorator

import src.composit.duck.Quackable
import src.composit.duck.observer.Observer

class QuackCounter(val duck: Quackable): Quackable {
    override fun registerObserver(observer: Observer) {
        duck.registerObserver(observer)
    }

    override fun notifyObserver() {
    }

    companion object {
        var numberOfQuacks:Int = 0

    }
    override fun quack() {
        duck.quack()
        numberOfQuacks++
    }



}