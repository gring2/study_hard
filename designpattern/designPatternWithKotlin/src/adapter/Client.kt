package src.adapter

import src.adapter.protoInterface.Duck

fun main(args: Array<String>) {
    val duck:MallardDuck = MallardDuck()

    val turkey:WildTurkey = WildTurkey()
    val turkeyAdapter:Duck = TurkeyAdapter(turkey)
    println("The Turkey says...")
    turkey.gobble()
    turkey.fly()

    println("\nThe Duck says...")
    testDuck(duck)

    println("\n The TurkeyAdapter says")
    testDuck(turkeyAdapter)
}

fun testDuck(duck: Duck){
    duck.quack()
    duck.fly()
}