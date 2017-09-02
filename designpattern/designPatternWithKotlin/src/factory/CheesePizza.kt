package src.factory

class CheesePizza(ingredientFactory: PizzaIngredientFactory):Pizza(ingredientFactory) {

    override fun prepare() {
        super.prepare()

    }

    override fun toString(): String {
        return "${this.name} ${this.dough} ${this.sauce} ${this.cheese}"
    }
}