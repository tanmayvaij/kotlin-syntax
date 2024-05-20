fun main() {

    val gender = "F"

    when (gender) {
        "M" -> {
            println("he")
            println("ye")
        }
        "F" -> println("h")
        else -> {
            println("go")
        }
    }

    val res = when (gender) {
        "M" -> {
            "MALE"
        }
        "F" -> "FEMALE"
        else -> {
            "UNKNOWN"
        }
    }

    println(res)

}