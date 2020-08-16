package spices

interface Grinder {
    fun grind()
}

abstract class Spice(var name: String, var spiciness: String = "mild",
                     color: SpiceColor) : SpiceColor by color {

    init {
        println("Name: ${name}, spiciness: ${spiciness}")
    }

    var heat: Int = 0
        get() {
            return when (this.spiciness) {
                "mild" -> 2
                "medium" -> 4
                "hot" -> 6
                else -> 0
            }
        }

    override fun toString(): String {
        return "$name $spiciness"
    }

    abstract fun prepareSpice()
}

open class Curry(name: String, spiciness: String = "medium", color: SpiceColor = YellowSpiceColor) :
        Spice(name = name, spiciness = spiciness, color = color), Grinder, SpiceColor by color {

    override fun prepareSpice() {
        TODO("Not yet implemented")
    }

    override fun grind() {
        println("you see me grinding")
    }
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color = "yellow"
}

class YellowCurry : Curry("Yellow Curry", "hot")


