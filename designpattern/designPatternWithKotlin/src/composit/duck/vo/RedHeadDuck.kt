package src.composit.duck.vo

import src.composit.duck.Quackable

class RedHeadDuck :AbstractDuck() {

    override fun quack() {
        println("Quack")
        notifyObserver()

    }
}