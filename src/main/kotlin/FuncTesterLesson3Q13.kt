fun main(args: Array<String>) {
    println("hello")
    whatShouldIDoToday("sad")
}


fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperatureC: Int = 24) : String {
    return when {
        mood == "happy" && weather == "Sunny" -> "go for a walk"
        else -> "Stay home and read."

    }
}