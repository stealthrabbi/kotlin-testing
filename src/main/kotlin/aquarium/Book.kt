package aquarium

open class Book(var author: String, var title: String) {

    private var currentPage = 1

    open fun readPage() {
        currentPage++
    }
}


class eBook(author: String, title: String, var format: String = "text") : Book(author, title) {
    var wordCount = 0

    override fun readPage() {
        wordCount += 250
    }
}

object MySingletonBook {

    private var myCount: Int = 0

    fun printMyThing() {
        myCount++;
        println(this.myCount)
    }

}