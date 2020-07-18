//fun prin

// from udacity kotlin course

import java.time.LocalDateTime
import java.util.*

fun main(args: Array<String>) {
//    val hour = args[0].toInt()
//    val isMorning = hour < 12
//    if (isMorning) {
//        println("good morning")
//    } else {
//        println("good eve")
//    }
//    println("hello ${args[0]}!")
//    dayOfWeek()
    feedTheFish()

    println(fitMoreFish(10.0, listOf(3,3,3)))
    println(fitMoreFish(8.0, listOf(2,2,2), hasDecorations = false))
    println(fitMoreFish(9.0, listOf(1,1,3), 3))
    println(fitMoreFish(10.0, listOf(), 7, true))

    for (i in 1..10) {
        val birthday = getBirthday()
        var yourFortune = getFortuneCookie(birthday)
        println(yourFortune)

        shouldChangeWater("hellO", dirty = 50)

        if (yourFortune == "Take it easy and enjoy life!") {
            break
        }

    }
}

fun dayOfWeek() {
    println("What day is today? : " + LocalDateTime.now().dayOfWeek.toString())
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)

    println("Today is $day and the fish eat $food")

    if (shouldChangeWater(day)) {
        println("change the water!")
    }
}

fun randomDay(): String {
    val week = listOf("Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun")
    return week[Random().nextInt(week.size)]
}

fun getBirthday(): Int {
    print("Enter your birthday: ")
    var birthday = readLine()?.toIntOrNull() ?: 1

    println("your birthday is $birthday")
    return birthday
}

fun getFortuneCookie(birthday: Int): String {
    val fortunes = listOf("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune.")


    return when (birthday) {
        28, 41 -> "I'm detective john kimble!"
        0 -> "a zero baby"
        else -> fortunes[birthday % fortunes.size]
    }
    2
}

fun fishFood(day: String): String {
    var food = "none"
    // when has a value, the last statement
    return when (day) {
        "Mon" -> "flakes"
        "Tue" -> "beef"
        "Sun" -> "salt"
        "Thur" -> "Moon"
        else -> "fasting"
    }
}

fun shouldChangeWater(
        day: String,
        temperature: Int = 22,
        dirty: Int = 20): Boolean {
    return true
}

fun fitMoreFish(tankSizeGallons : Double, currentFish : List<Int>, newFishLength : Int = 2, hasDecorations: Boolean = true) : Boolean{
    var scaleFactor = if (hasDecorations) 0.8 else 1.0

    var totalFishLength = currentFish.sum()
    var allowedFish = tankSizeGallons * scaleFactor
    var extraFishBuffer = allowedFish - totalFishLength

    return newFishLength <= extraFishBuffer
}
