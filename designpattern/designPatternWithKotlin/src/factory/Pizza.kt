package src.factory

abstract class Pizza(val ingredientFactory: PizzaIngredientFactory) {
    var name:String=""
    set(value) {field = value}

    lateinit var dough:Dough
    lateinit var sauce:Sauce
    lateinit var veggies:Array<Veggies>
    lateinit var cheese:Cheese
    lateinit var pepperoni:Pepperoni
    lateinit var clam:Clams

    open fun prepare(){
        println("preparing ${name}" )
       dough = ingredientFactory.createDough()
       sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
    }

    fun bake(){
        println("Bake for 25 minutes at 350")

    }

    open fun cut(){
        println("Cutting the pizza into diagonal slices")
    }

    fun box(){
        println("Place pizza in official PizzaStore box")

    }


}