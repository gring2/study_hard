package src.state.stateInterface

import src.state.GumballMachine

class NoQuarterState(val gumballMachine: GumballMachine) : State {
    override fun insertQuarter() {
        println("you inserted coin")
        gumballMachine.state = gumballMachine.hasQuarterState
    }
    override fun ejectQuarter(){
        println("Please insert Coin")
    }
}