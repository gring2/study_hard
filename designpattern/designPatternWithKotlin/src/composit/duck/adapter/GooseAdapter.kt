package src.composit.duck.adapter

import src.composit.duck.Quackable
import src.composit.duck.vo.AbstractDuck
import src.composit.duck.vo.Goose

class GooseAdapter(val goose: Goose): AbstractDuck() {

    override fun quack() {
        goose.honk()
        notifyObserver()

    }
}