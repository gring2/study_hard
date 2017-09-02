package src.iteratorAndComposition

import java.util.*
import kotlin.concurrent.timerTask

class CafeMenu(name:String, desc:String):Menu(name, desc) {

    init {
            addItem("Vege burger with air fry",
                    "brown bread, lettuce, tomato, french fries added vegeburger",
                    true, 3.99)
        addItem("Today's soup",
                "Today's soup with salad",
                false, 3.69)

        addItem("beritto",
                "whole pinto bean and salsa, guacamoul with big berrito",
                true, 4.29)

    }

    fun addItem(name:String, desc:String, vege:Boolean, price:Double){
        val menuItem:MenuItem = MenuItem(name, desc, vege, price)
        super.add(menuItem)
    }
}