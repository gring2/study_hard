package src.adapter

import src.adapter.protoInterface.Duck

class MallardDuck: Duck {
    override fun quack() {
        println("Quack")
    }

    override fun fly() {
        println("I am flying")
    }
}