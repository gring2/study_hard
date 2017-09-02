package src.template

abstract class CaffeinBeverage {

    fun prepareRecipe(){
        boilWater()
        brew()
        pourCup()
        if(customerWantsCondiments()){
            addCondiments()

        }
    }

    abstract fun brew()

    abstract fun addCondiments()

    fun boilWater(){
        println("Boil Water")
    }

    fun pourCup(){
        println("Pour in Cup")
    }
    open fun customerWantsCondiments():Boolean{
        return true
    }
}