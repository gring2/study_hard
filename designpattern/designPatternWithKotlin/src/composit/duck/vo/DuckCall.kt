package src.composit.duck.vo

import src.composit.duck.Quackable
import src.composit.duck.observer.Observable
import src.composit.duck.observer.Observer

class DuckCall : AbstractDuck() {

    override fun quack() {
        println("Kwak")
        notifyObserver()
    }
}