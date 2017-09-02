package src.template

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

class Tea:CaffeinBeverage() {
    override fun brew() {
        println("brew tea")
    }

    override fun addCondiments() {
        println("add some lemons")
    }

    override fun customerWantsCondiments(): Boolean {
        val answer:String = getUserInput()

        return answer.toLowerCase().startsWith('y')

    }

    private fun getUserInput():String{
        var answer:String?=null
        println("Want lemons?")

        val reader = BufferedReader(InputStreamReader(System.`in`))
        try {
            answer = reader.readLine()
        }catch (e: IOException){
            error("IO error")
        }

        if(answer == null){
            return  "no"
        }
        return answer

    }
}