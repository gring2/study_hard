package src.factory

class ChicagoPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough {
        return Dough.ThickCrustDough
    }

    override fun createSauce(): Sauce {
        return Sauce.PlumTomatoSauce
    }

    override fun createCheese(): Cheese {
        return Cheese.MozzarellaCheese
    }

    override fun createVeggies(): Array<Veggies> {
        val veggies = arrayOf(Veggies.Garlic, Veggies.Onion, Veggies.Mushroom, Veggies.RedPepper)
        return veggies
    }

    override fun createPepperoni(): Pepperoni {
        return Pepperoni.SlicedPepperoni
    }

    override fun createClam(): Clams {
        return Clams.FrozenClams
    }
}