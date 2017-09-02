package src.iteratorAndComposition

class MenuItem( name:String, val description:String,
                val vegetarian:Boolean,  price:Double): MenuComponent() {

    private val name:String = name
    private val price:Double = price
    private val desc:String = description
    private val vege:Boolean = vegetarian
    override fun add(menuComponent: MenuComponent) {
        throw UnsupportedOperationException()

    }

    override fun remove(menuComponent: MenuComponent) {
        throw UnsupportedOperationException()

    }

    override  fun getChild(i: Int): MenuComponent {
        throw UnsupportedOperationException()
    }

    override fun getName(): String {
        return this.name
    }

    override fun getDesc(): String {
        return this.desc

    }

    override fun getPrice(): Double {
       return this.price

    }

    override fun isVege(): Boolean {
        return this.vege
    }

    override fun print() {
        println("      ${getName()}")
        if(isVege()){
            println("(V)")
        }

        println(",      ${getPrice()}")
        println("       ----- ${getDesc()}  ")

    }

    override fun createIterator():Iterator<MenuComponent?>{
        return NullIterator()
    }
}

