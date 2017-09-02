package src.iteratorAndComposition

class Waitress(val allMenus:MenuComponent){
    fun printMenu(){
        allMenus.print()
    }

    fun printVegetarianMenu(){
        val iterator = allMenus.createIterator()
        println("\nVEGETARIAN MENU\n----")
        while (iterator.hasNext()){
            val menuComponent = iterator.next()

            try{
                if( menuComponent!!.isVege()){
                    menuComponent.print()
                }
            }catch (e:UnsupportedOperationException){

            }
        }
    }

}