package src.adapter.Enumerable

import java.util.*


class EnumerationIterator(val enum:Enumeration<Any>):Iterator<Any> {
    override fun hasNext(): Boolean {
        return this.enum.hasMoreElements();
    }

    override fun next(): Any {
        return this.enum.nextElement()
    }

    fun remove(){
        throw UnsupportedOperationException()
    }
}