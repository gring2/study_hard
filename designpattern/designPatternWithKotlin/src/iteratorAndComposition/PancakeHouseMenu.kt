package src.iteratorAndComposition

class PancakeHouseMenu(name:String, desc:String):Menu(name, desc) {

    init {
        addItem("K&B Pancake set",
                "Scrambled Egg and toast with Pancake",
                true, 2.99)

        addItem("Regular Pancake set",
                        "Egg fry and sausage Pancake",
                                false, 2.99)


        addItem("Blueberry Pancake",
                "fresh Blueberry and Blueberry syrup Pancake",
                true, 3.49)

        addItem("Waffle",
                "waffle, blueberry and strawberry could be chosen",
                true, 3.59)

    }

    fun addItem(name:String, desc:String, vege:Boolean, price:Double){
        val menuItem:MenuItem = MenuItem(name, desc, vege, price)
        super.add(menuItem)
    }



}