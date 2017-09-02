package src.template.Duck

class Duck(val name:String, val weight:Int):Comparable<Any> {
    override fun compareTo(other: Any): Int {
        val originDuck:Duck? = other as? Duck

        if(this.weight < originDuck!!.weight){
            return -1
        }else if(this.weight == originDuck.weight){
            return 0
        }else{
            return 1
        }

    }

    override fun toString(): String {
        return "${this.name} Weight ${this.weight}"
    }
}