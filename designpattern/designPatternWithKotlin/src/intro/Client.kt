package intro

fun main(args: Array<String>) {
    val mallard:MallardDuck = MallardDuck();
    mallard.performQuack()
    mallard.performFly()
    val model: Duck = ModelDuck()
    model.performFly()
    model.flyBehavier = FlyRocketPowered();

    model.performFly()


}