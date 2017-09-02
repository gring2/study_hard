package src.iteratorAndComposition

fun main(args: Array<String>) {
    val pancakeHouseMenu:MenuComponent = PancakeHouseMenu(
            "PancakeHouse Menu", "breakfast Menu"
    )

    val dinerMenu:MenuComponent = DinerMenu(
            "objectvillege diner Menu", "lunch Menu"
    )
    val cafeMenu:MenuComponent = CafeMenu(
            "cafe Menu", "dinner Menu"
    )
    val dessertMenu:MenuComponent = Menu(
            "dessert Menu", "enjoy dessert Menu"
    )

    val allMenus = Menu(
            "All Menus", "All Menus"
    )

    allMenus.add(pancakeHouseMenu)
    allMenus.add(dinerMenu)
    allMenus.add(cafeMenu)

    dinerMenu.add(MenuItem(
            "Pasta",
            "Marinara sauce Spagetti, yeast bread served",
            true,
            3.89
    ))
    dinerMenu.add(dessertMenu)
    dessertMenu.add(MenuItem(
            "apple pie",
            "crunch crust vanilla icecream on top",
            true,
            1.59
    ))

    val waitress = Waitress(allMenus)
//    waitress.printMenu()
    waitress.printVegetarianMenu()
}