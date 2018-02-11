package src.composit.duck

import src.composit.duck.observer.QuackObservable

interface Quackable:QuackObservable {
    fun quack()
}