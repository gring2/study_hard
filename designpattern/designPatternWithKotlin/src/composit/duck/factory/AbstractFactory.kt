package src.composit.duck.factory

import src.composit.duck.Quackable
import src.composit.duck.vo.*
abstract class AbstractFactory {

    abstract fun createMallardDuck(): Quackable
    abstract fun createRedheadDuck(): Quackable
    abstract fun createDuckCall(): Quackable
    abstract fun createRubberDuck(): Quackable

}