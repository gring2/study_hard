package src.state.stateInterface

import src.state.GumballMachine
import java.util.*

class HasQuarterState(val gumballMachine: GumballMachine) : State {
    val randomWinner = Random(System.currentTimeMillis())

    override fun insertQuarter() {
        println("Please insert Only one coin")
    }

    override fun ejectQuarter() {
        super.ejectQuarter()
        gumballMachine.state = gumballMachine.noQuarterState
    }

    override fun turnCrank() {
        println("you turned knob")
        val winner = randomWinner.nextInt(10)
        if((winner == 0) && (gumballMachine.count > 1)){
            gumballMachine.state = gumballMachine.winnerState

        }else{
            gumballMachine.state = gumballMachine.soldState
        }
    }

    override fun dispense() {
        println("ball is not able to get out")
    }
}