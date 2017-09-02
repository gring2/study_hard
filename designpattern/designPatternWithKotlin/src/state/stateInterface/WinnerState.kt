package src.state.stateInterface

import src.state.GumballMachine

class WinnerState(val gumballMachine: GumballMachine) : State {
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
        println("Congrat you can get one more ball")
        gumballMachine.realeaseBall()
        if(gumballMachine.count  == 0){
            gumballMachine.state = gumballMachine.soldOutState
        }else{
            gumballMachine.realeaseBall()
            if(gumballMachine.count > 0){

                 gumballMachine.state=gumballMachine.noQuarterState
            }else{
                println("no more ball")
                gumballMachine.state = gumballMachine.soldOutState
            }
        }
    }
}