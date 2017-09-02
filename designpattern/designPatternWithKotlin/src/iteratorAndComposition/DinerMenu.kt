package src.iteratorAndComposition

class DinerMenu(name:String, desc:String):Menu(name, desc){



    init {
        addItems("Vegetarian BLT",
                "Vegetarian Bacon, Letus, tomato added brown bread menu", true, 2.99)

        addItems("BLT",
                "Bacon, Letus, tomato added brown bread menu", true, 2.99)

        addItems("Todays soup",
                "soup with potato salad", false, 3.29)

        addItems("Hot dog",
                "sour crauwt, seasoning, onion, cheese added Hotdog", false, 3.05)

    }
   private fun addItems(name:String, desc:String, vege:Boolean, price:Double){
        val menuItem:MenuItem = MenuItem(name, desc, vege, price)
       super.add(menuItem)

   }
}