package src.composit.duck.vo

import src.composit.duck.Quackable

class RubberDuck : AbstractDuck() {

    override fun quack() {
        println("Squeak")
        notifyObserver()

    }
}