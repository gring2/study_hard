package src.iteratorAndComposition

abstract class MenuComponent {

    open  fun add(menuComponent: MenuComponent) {
         throw UnsupportedOperationException()

    }

    open fun remove(menuComponent: MenuComponent) {
        throw UnsupportedOperationException()

    }

     open fun getChild(i: Int): MenuComponent {
        throw UnsupportedOperationException()
    }

     open fun getName(): String {
         throw UnsupportedOperationException()

    }

     open fun getDesc(): String {
         throw UnsupportedOperationException()

    }

     open fun getPrice(): Double {
         throw UnsupportedOperationException()

    }

     open fun isVege(): Boolean {
         throw UnsupportedOperationException()

    }

     open fun print() {
         throw UnsupportedOperationException()

    }

    abstract fun createIterator():Iterator<MenuComponent?>
}