package src.composit.duck.vo

import src.composit.duck.Quackable
import src.composit.duck.observer.Observable
import src.composit.duck.observer.Observer
import src.composit.duck.observer.QuackObservable

abstract class AbstractDuck:Quackable {
    val observable:Observable = Observable(this);
    abstract override fun quack()

    override fun registerObserver(observer: Observer) {

        observable.registerObserver(observer)
    }

     override fun notifyObserver(){
         observable.notifyObserver()
     }

    override fun toString(): String {
        return "Duck ${this.javaClass.name} just Quacked"
    };

}