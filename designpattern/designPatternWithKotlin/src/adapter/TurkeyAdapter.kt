package src.adapter

import src.adapter.protoInterface.Duck
import src.adapter.protoInterface.Turkey

class TurkeyAdapter(val turkey: Turkey):Duck {
    override fun quack() {
        turkey.gobble()
    }

    override fun fly() {
        for (i in 0..4) {
            turkey.fly()
        }
    }
}