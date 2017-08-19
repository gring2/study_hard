package observer

fun main(args: Array<String>) {
    val weather: WeatherData = WeatherData()

    val currentDisplay:CurrentConditionDisplay = CurrentConditionDisplay(weather)

    weather.setMeasurements(80f, 65f, 30.4f)
    weather.setMeasurements(82f, 70f, 29.2f)
   weather.setMeasurements(78f, 90f, 29.2f)

}