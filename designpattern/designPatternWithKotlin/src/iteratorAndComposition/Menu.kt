package src.iteratorAndComposition

open class Menu(name:String, desc:String):MenuComponent(){
    private val menuComponents:MutableList<MenuComponent>
    private val name:String = name
    private val desc:String = desc
    init {
        menuComponents = ArrayList()
    }

    override fun add(menuComponent: MenuComponent) {
        menuComponents.add(menuComponent)
    }

    override fun remove(menuComponent: MenuComponent) {
        menuComponents.remove(menuComponent)
    }

    override fun getChild(i: Int): MenuComponent {
        return menuComponents.get(i)
    }

    override fun getName(): String {
        return this.name
    }

    override fun getDesc(): String {
        return this.desc
    }

    override fun getPrice(): Double {
        return super.getPrice()
    }

    override fun isVege(): Boolean {
        return super.isVege()
    }

    override fun print() {
        print("\n     ${getName()}")
        println(",      ${getDesc()}")
        println("-------------------")

        val iterator = this.menuComponents.iterator()
        while(iterator.hasNext()){
            val menuComponent = iterator.next()
            menuComponent.print()
        }
    }

    override fun createIterator(): Iterator<MenuComponent?> {
        return CompositeIterator(menuComponents.iterator())
    }
}