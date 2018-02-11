package src.composit.duck.factory

import src.composit.duck.Quackable
import src.composit.duck.decorator.QuackCounter

import src.composit.duck.vo.*
class CountingDuckFactory: AbstractFactory() {
    override fun createMallardDuck(): Quackable {
        return QuackCounter(MallardDuck())
    }

    override fun createRedheadDuck(): Quackable {
        return QuackCounter(RedHeadDuck())
    }

    override fun createDuckCall(): Quackable {
        return QuackCounter(DuckCall())
    }

    override fun createRubberDuck(): Quackable {
        return QuackCounter(RubberDuck())
    }

}