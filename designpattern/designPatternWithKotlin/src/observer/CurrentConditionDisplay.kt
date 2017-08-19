package observer

import java.util.*
import java.util.Observer

class CurrentConditionDisplay(ob: Observable): Observer, DisplayElement {
    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * `notifyObservers` method to have all the object's
     * observers notified of the change.
     *
     * @param   o     the observable object.
     * @param   arg   an argument passed to the `notifyObservers`
     * method.
     */
    override fun update(o: Observable?, arg: Any?) {
      //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        if(o is WeatherData){
            val weatherdata = o
            this.tempa = weatherdata.temp
            this.humi = weatherdata.humidity
            display()
        }
    }

    private var tempa: Float = 0F
    private var humi: Float = 0F
    init {
        ob.addObserver(this)
    }
    override fun display() {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("Current condition: $tempa +\"F degrees and $humi% humidify\" ")
    }
}