package src.state.stateInterface

import src.state.GumballMachine

class SoldOutState(val gumballMachine: GumballMachine) : State {
    override fun insertQuarter() {
        println("balls are soldOut")
        ejectQuarter()
    }


    override fun turnCrank() {
        println("balls are soldOut")
        ejectQuarter()
    }

    override fun dispense() {
    }
}