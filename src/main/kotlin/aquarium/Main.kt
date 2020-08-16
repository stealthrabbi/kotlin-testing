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
    var smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    var aquarium2 = Aquarium(numberOfFish = 44)
    println("Volume: ${smallAquarium.volume}" )


    var singleBook = MySingletonBook
    var singleBook2 = MySingletonBook

    singleBook.printMyThing()
    singleBook2.printMyThing()
    singleBook.printMyThing()
    singleBook2.printMyThing()

}
