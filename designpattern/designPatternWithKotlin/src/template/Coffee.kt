package src.template

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

class Coffee:CaffeinBeverage() {
    override fun brew() {
        println("brew coffee")
    }

    override fun addCondiments() {
        println("Add some sugar and milk")
    }

    override fun customerWantsCondiments(): Boolean {
        val answer:String = getUserInput()

       return answer.toLowerCase().startsWith('y')

    }

    private fun getUserInput():String{
        var answer:String?=null
        println("Want some sugar and milk?")

        val reader = BufferedReader(InputStreamReader(System.`in`))
        try {
            answer = reader.readLine()
        }catch (e:IOException){
            error("IO error")
        }

        if(answer == null){
                return  "no"
        }
        return answer

    }
}