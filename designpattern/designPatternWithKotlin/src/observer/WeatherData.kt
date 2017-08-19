package observer

import java.util.*

class WeatherData: Observable() {
    var temp:Float= 0F
    var humidity:Float= 0F
    var pressure:Float= 0F
    var observers:MutableList<Observer> = ArrayList();

    fun measurementsChanged(){
        setChanged()
        notifyObservers()
    }

    fun setMeasurements(temp:Float, humidity:Float, pressure:Float){
        this.temp = temp
        this.humidity = humidity
        this.pressure = pressure

        measurementsChanged()
    }
}