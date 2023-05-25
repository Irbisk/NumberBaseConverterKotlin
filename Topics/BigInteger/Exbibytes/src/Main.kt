import java.math.BigInteger

fun main() {
    val n = readln().toBigInteger()
    val mult = BigInteger("9223372036854775808")
    println(n * mult)
}