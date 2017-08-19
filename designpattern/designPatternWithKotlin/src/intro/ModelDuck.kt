package intro

class ModelDuck:Duck() {
    init {
        flyBehavier = FlyNoWay()
        quackBehavier = Quack()
    }
    override fun display() {
        //
        print("저는 모형 오리입니다")
    }
}