package intro

class MallardDuck: Duck() {
    private var test:String=""
    set(value) {field = value}
    init {
        quackBehavier = Quack();
        flyBehavier = FlyWithWings();
    }
    override fun display() {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("저는 물오리 입니다")
    }
}