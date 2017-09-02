package src.template

fun main(args: Array<String>) {
  val teaHook:Tea = Tea()
    val coffee:Coffee = Coffee()

    println("\nmaking tea")
    teaHook.prepareRecipe()
    println("making coffee")
    coffee.prepareRecipe()
}