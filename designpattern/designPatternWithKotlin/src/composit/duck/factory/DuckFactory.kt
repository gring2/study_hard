package src.composit.duck.factory

import src.composit.duck.Quackable
import src.composit.duck.vo.*

class DuckFactory: AbstractFactory() {
    override fun createMallardDuck(): Quackable {
        return MallardDuck()
    }

    override fun createRedheadDuck(): Quackable {
        return RedHeadDuck()
    }

    override fun createDuckCall(): Quackable {
        return DuckCall()
    }

    override fun createRubberDuck(): Quackable {
        return RubberDuck()
    }
}