package src.factory

class ChicagoPizzaStore : PizzaStore(){

    override fun createPizza(type: String): Pizza? {
        var pizza: Pizza? = null
        val pizzaiIngredientFactory:ChicagoPizzaIngredientFactory = ChicagoPizzaIngredientFactory()
        if(type == "cheese"){
            pizza = CheesePizza(pizzaiIngredientFactory)
            pizza.name="Chicago Style Cheese Pizza"
        }else if (type == "clam"){
            pizza = ClamPizza(pizzaiIngredientFactory)
            pizza.name="Chicago Style Clam Pizza"

        }
            return pizza

    }
}