package spices


fun main(args: Array<String>) {
    val spices = listOf(
            Curry("curry"), Curry("pepper"), Curry("cayenne", "hot"),
            Curry("ginger"), Curry("red curry", "hot"),
            Curry("green curry", "medium"), Curry("red pepper", "medium"),
            Curry("curry 2", "hot"))

    var nonHotSpices = spices.filter { s -> s.heat <= 4 }
    println("hot spices: ${nonHotSpices}")

}