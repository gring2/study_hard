package src.factory

class ClamPizza(ingredientFactory: PizzaIngredientFactory):Pizza(ingredientFactory) {
    override fun prepare() {
        super.prepare()
        clam = ingredientFactory.createClam()
    }

    override fun toString(): String {
        return "${this.name} ${this.dough} ${this.sauce} ${this.cheese} ${this.clam}"
    }

}