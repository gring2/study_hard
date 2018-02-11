package src.factory

fun main(args: Array<String>) {
    //팩토리 패턴은 객체 생성을 완전히 서브 클래스에 위임한다
    //<팩토리의 생산 객체의 원형만을 규정>
    //상위 클래스나 클라이언트 클래스에서는 생성되는 객체의 구체적인 방법에 대해서는 완전히 캡슐화 되어 있기 때문에 알지 못한다
    //추상 픅토리 파턴은 관련이 있는 객체군을 생성하기 위한 인터페이스를 제공한다
    //서브 클래스가 상위 인터페이스를 구현하기 때문에 연관 객체들이 생성되는 과정을 추상화 하여 관리 할 수 있다.
    //<팩토리의 원형을 제공하는 느낌>
    val nypizzaStore:PizzaStore = NYPizzaStore()
    val chicagoStore:PizzaStore = ChicagoPizzaStore()

    var pizza:Pizza = nypizzaStore.orderPizza("cheese")!!
    println("Ethan ordered a ${pizza.name}")
    println("Pizza is ${pizza.toString()}")
    println("")
    pizza = chicagoStore.orderPizza("cheese")!!
    println("Joel ordered a ${pizza.name}")
    println("Pizza is ${pizza.toString()}")
    println("")
    pizza = nypizzaStore.orderPizza("clam")!!
    println("Ethan ordered a ${pizza.name}")
    println("Pizza is ${pizza.toString()}")

    println("")
    pizza = chicagoStore.orderPizza("clam")!!
    println("Joel ordered a ${pizza.name}")
    println("Pizza is ${pizza.toString()}")

}