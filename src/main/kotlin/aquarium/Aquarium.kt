package aquarium

import java.lang.Math.PI

// constructro with vars creates properties with var/val
open class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    // assigned in constructor
//    var width: Int = height
//    var height: Int = width
//    var length: Int = length

    // declare this as a property, rather than a function for simpler invocation
    // override the getter, rather than using it like an "auto" property
    open var volume: Int
        get() {
            return width * height * length / 1000
        }
        set(value) {
            height = (value * 1000) / (width * length)
        }


    open var water = volume * 0.9

//    fun volume() = width * height * length / 1000

    constructor(numberOfFish: Int) : this() {
        val water = numberOfFish * 2000 // cm3
        val tank = water + water * 0.01
        height = (tank / (length * width)).toInt()
    }

    private fun myFun() {
        println("my private function")
    }

}

class TowerTank() : Aquarium() {
    override var water = volume * 0.8

    override var volume: Int
        get() = (width * height * length / 1000 * PI).toInt()
        set(value) { height = (value * 1000) / (width * length) }
}