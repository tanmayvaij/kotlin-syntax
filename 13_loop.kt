fun main() {

    val letters = arrayOf<String>("A", "B", "C", "D", "E")

    println("printing content")
    for ( letter in letters ) println(letter)

    println("printing indices")
    for ( index in letters.indices ) println(index)

    println("printing range asc")
    for ( i in 1..5 ) println(i)

    println("printing range desc")
    for ( i in 5 downTo 1 ) println(i)

    println("printing range with skip")
    for (i in 1..5 step 2 ) println(i)

    println("printing with forEach")
    letters.forEach {
        println(it)
    }

//    while, do while, break ,continue loop same as python, js

}