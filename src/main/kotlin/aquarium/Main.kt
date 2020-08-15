package aquarium

fun main (args: Array<String>) {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()

    myAquarium.height = 999

    println("Length: ${myAquarium.height}")
    println("Volume: ${myAquarium.volume}")

    // can't access private function
    // myAquarium.myFun()
}
