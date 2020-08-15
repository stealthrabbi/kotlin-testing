package aquarium

class Aquarium {
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100

    // declare this as a property, rather than a function for simpler invocation
    // override the getter, rather than using it like an "auto" property
    var volume : Int
        get() {
            return width * height * length / 1000
        }
        set(value) {
            height = (value * 1000) / (width * length)
        }


//    fun volume() = width * height * length / 1000

    private fun myFun() {
        println("my private function")
    }

}