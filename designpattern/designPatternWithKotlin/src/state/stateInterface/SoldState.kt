package src.state.stateInterface

import src.state.GumballMachine

class SoldState(val gumballMachine: GumballMachine):State {
    override fun insertQuarter() {
        println("Wait a second, ball is coming out")
    }

    override fun ejectQuarter() {
        println("you already eject the ball")
    }

    override fun turnCrank() {
        print("Please turn the knob just once")
    }

    override fun dispense() {
        gumballMachine.realeaseBall()
        if(gumballMachine.count > 0){
            gumballMachine.state = gumballMachine.noQuarterState
        }else{
            println("Oops out of balls")
            gumballMachine.state = gumballMachine.soldOutState
        }
    }
}