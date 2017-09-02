package src.iteratorAndComposition

import java.util.*

class CompositeIterator(iterator: Iterator<MenuComponent>) :Iterator<MenuComponent?> {

    val stack = Stack<Iterator<MenuComponent?>>()
    init {
        this.stack.push(iterator)
    }
    override fun hasNext(): Boolean {
        if(this.stack.empty()){
            return false
        }else{
            val iterator = stack.peek()

            if(iterator.hasNext()){
                return true
            }else{
                stack.pop()
                return hasNext()
            }
        }

    }

    override fun next(): MenuComponent? {
        if(hasNext()){
            val iterator = stack.peek()
            val component = iterator.next()
            if (component is Menu){
                stack.push(component.createIterator())
            }
            return component
        }else{
            return null
        }
    }
}