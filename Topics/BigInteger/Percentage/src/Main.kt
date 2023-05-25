import java.math.BigInteger

fun main() {
    val a = BigInteger(readln())
    val b = BigInteger(readln())
    val sum = a + b

    println("${a * BigInteger.valueOf(100) / sum}% ${b * BigInteger.valueOf(100) / sum}%")
}