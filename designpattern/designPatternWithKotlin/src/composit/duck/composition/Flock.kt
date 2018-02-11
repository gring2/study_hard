package src.composit.duck.composition

import src.composit.duck.Quackable
import src.composit.duck.observer.Observer

class Flock:Quackable {
    val quackers:MutableList<Quackable> = ArrayList()

    override fun registerObserver(observer: Observer) {
        val iterator = quackers.iterator()
        while(iterator.hasNext()){
            val item = iterator.next()
            item.registerObserver(observer)

        }

    }
    fun add(duck:Quackable){
        quackers.add(duck)
    }
    override fun notifyObserver() {

    }

    override fun quack() {
        val iterator = quackers.iterator()
        while(iterator.hasNext()){
           val item = iterator.next()
                item.quack()

        }
    }
}