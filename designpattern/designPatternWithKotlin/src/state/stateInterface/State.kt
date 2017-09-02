package src.state.stateInterface

interface State {
    fun insertQuarter()
    fun ejectQuarter(){
        println("the coin is returned")
    }
    fun turnCrank(){
        println("Please insert Coin")
    }
    fun dispense(){
        println("Please insert Coin")
    }
}