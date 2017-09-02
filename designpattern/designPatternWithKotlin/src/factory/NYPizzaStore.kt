package src.factory

class NYPizzaStore:PizzaStore(){

    override fun createPizza(type: String): Pizza? {
        var pizza:Pizza? = null
        val pizzaIngredientFactory:PizzaIngredientFactory = NYPizzaIngredientFactory()
        if(type == "cheese"){
            pizza = CheesePizza(pizzaIngredientFactory)
            pizza.name = "New york Sytle Cheese Pizza"
        }else if(type == "clam"){
            pizza = ClamPizza(pizzaIngredientFactory)
            pizza.name = "New york Sytle Clam Pizza"

        }

        return pizza

    }
}