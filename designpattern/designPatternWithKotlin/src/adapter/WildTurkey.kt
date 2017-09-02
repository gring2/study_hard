package src.adapter

import src.adapter.protoInterface.Turkey

class WildTurkey:Turkey {
    override fun gobble() {
        println("Gobble gobble")
    }

    override fun fly() {
        println("I am flying but a  short distance")
    }
}