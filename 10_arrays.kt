fun main() {

    val friends = arrayOf<String>("Parth", "Viraj", "Sandeep")

    println(friends.contentToString())

    if ( "Parth" in friends ) {
        println("available")
    }

}