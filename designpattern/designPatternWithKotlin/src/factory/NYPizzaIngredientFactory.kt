package src.factory

class NYPizzaIngredientFactory:PizzaIngredientFactory {
    override fun createDough(): Dough {
        return Dough.ThinCrustDough
    }

    override fun createSauce(): Sauce {
        return Sauce.MarinaraSauce
    }

    override fun createCheese(): Cheese {
        return Cheese.ReggianoCheese
    }

    override fun createVeggies(): Array<Veggies> {
        val veggies = arrayOf(Veggies.Garlic, Veggies.Onion, Veggies.Mushroom, Veggies.RedPepper)
        return veggies
    }

    override fun createPepperoni(): Pepperoni {
        return Pepperoni.SlicedPepperoni
    }

    override fun createClam(): Clams {
        return Clams.FreshClams
    }
}