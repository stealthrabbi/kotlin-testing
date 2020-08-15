fun main(args: Array<String>) {
    print("hello. What is your mood? s")
    // throw exception if readLine() returns null, otherwise converts form String? to String.
    println(whatShouldIDoToday(readLine()!!))
}


fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperatureC: Int = 24) : String {
    return when {
        isGoForWalk(mood, weather) -> "go for a walk"
        isStayInBed(mood, weather, temperatureC) -> "stay in bed"
        isGoSwimming(temperatureC) -> "go swimming"
        else -> "Stay home and read."

    }
}

private fun isGoSwimming(temperatureC: Int) = temperatureC > 35

private fun isStayInBed(mood: String, weather: String, temperatureC: Int) =
        mood == "sad" && weather == "rainy" && temperatureC == 0

private fun isGoForWalk(mood: String, weather: String) = mood == "happy" && weather == "Sunny"

//fun isHappy


