package src.state

import src.state.stateInterface.*

class GumballMachine(    var count:Int= 0) {
    val soldOutState:State = SoldOutState(this)
    val noQuarterState:State = NoQuarterState(this)
    val hasQuarterState:State = HasQuarterState(this)
    val soldState:State = SoldState(this)
    val winnerState:State = WinnerState(this)
    var state = soldOutState
        set(value) {
            field = value
            if(value is SoldState || value is WinnerState){
                state.dispense()
            }

        }

    init {
        if(count > 0){
            state  =noQuarterState
        }
    }

    fun insertQuarter(){
    state.insertQuarter()
    }

    fun ejectQuarter(){
        state.ejectQuarter()
    }

    fun turnCrank(){
        state.turnCrank()
    }

    protected fun dispense(){
        state.dispense()
    }

    override fun toString(): String {
        return "coint left ${this.count}"
    }

    fun realeaseBall(){
        println("A gumball comes rolling out the slot...")
        if(count >0){
            count -= 1
        }
    }
}