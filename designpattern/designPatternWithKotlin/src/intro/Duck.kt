package intro

abstract class Duck() {
      var flyBehavier: FlyBehavior? = null
        set(value){

            field = value
        }
     var quackBehavier: QuackBehavior? = null
         set(value){
          field = value
          }
    abstract fun display();

    fun performFly(){
        flyBehavier?.fly();
    }

    fun performQuack(){
        quackBehavier?.quak();
    }

    fun swim(){
        println("모든 오리는 물에 뜹니다 가짜 오리도 뜨죠")
    }
}