package src.factory

fun main(args: Array<String>) {
    val nypizzaStore:PizzaStore = NYPizzaStore()
    val chicagoStore:PizzaStore = ChicagoPizzaStore()

    var pizza:Pizza = nypizzaStore.orderPizza("cheese")!!
    println("Ethan ordered a ${pizza.name}")
    println("Pizza is ${pizza.toString()}")
    println("")
    pizza = chicagoStore.orderPizza("cheese")!!
    println("Joel ordered a ${pizza.name}")
    println("Pizza is ${pizza.toString()}")
    println("")
    pizza = nypizzaStore.orderPizza("clam")!!
    println("Ethan ordered a ${pizza.name}")
    println("Pizza is ${pizza.toString()}")

    println("")
    pizza = chicagoStore.orderPizza("clam")!!
    println("Joel ordered a ${pizza.name}")
    println("Pizza is ${pizza.toString()}")

}