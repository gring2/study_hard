package src.template.Duck

import java.util.*

fun main(args: Array<String>) {
    val duck:Array<Duck> = arrayOf(
            Duck("Daffy", 8),
            Duck("Dewey", 2),
            Duck("Howard", 7),
            Duck("Louie", 2),
            Duck("Donald", 10),
            Duck("Huey", 2)
    )

    println("Before sorting")
    display(duck)

    duck.sort()
    println("\n After sorting")

    display(duck)
}

fun display(ducs:Array<Duck>){
    for(i in 0 until ducs.size){
        println(ducs[i])
    }
}