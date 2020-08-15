import java.util.*

fun main(args: Array<String>) {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper","curry 2")
    var curries = spices.filter { it.contains("curry") }.sortedBy { it.length }
//            .sortedWith(compareBy(it.lenth))

    var cESpices = spices.filter {it.startsWith('c') }.filter {it.endsWith('e')}

    println("Curries: $curries")
    println("cESpices: $cESpices")






    println(rollDice(20))
    println(rollDice(12))
    println(rollDice(6))

}

val rollDice = {sides: Int ->  Random().nextInt(sides) + 1}

val rollDice2: (Int) -> Int = { sides ->
    if (sides == 0) 0
    else Random().nextInt(sides) + 1
}