import euclid.Euclid

fun main(args: Array<String>) {
    val e = Euclid()

    println("Recursion: ${e.gcd(22, 6)}")
    println("Without recursion: ${e.gcd2(22, 6)}")

}