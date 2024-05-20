fun main() {

    val n = 200

    when {
        ( n==100 ) -> println("100")
        ( n==200 ) -> println("200")
        else -> println("UNKNOWN")
    }

    val age = 18

    when (age) {
        in 13..19 -> println("Perfect")
        !in 13..19 -> println("Imperfect")
    }

}
