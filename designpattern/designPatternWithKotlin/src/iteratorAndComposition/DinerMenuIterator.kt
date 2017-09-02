package src.iteratorAndComposition

class DinerMenuIterator(val menuIteams:Array<MenuItem?>):Iterator<MenuItem?> {
    var position:Int = 0

    override fun hasNext(): Boolean {
        return !(position >= menuIteams.size || menuIteams[position] == null)
    }

    override fun next(): MenuItem? {
        val menuItem: MenuItem? = menuIteams[position]
        position +=1
        return menuItem
    }

    fun remove(){
        if(position > 0) {
            throw IllegalStateException("if you don't call NEXT() even once, never remove")
        }

        if(menuIteams[position-1] != null){
            for (i in position-1 until menuIteams.size-1 ){
                menuIteams[i] = menuIteams[i+1]
            }
            menuIteams[menuIteams.size-1] = null
        }
    }

}