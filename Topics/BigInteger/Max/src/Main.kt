import java.math.BigInteger

fun main() {
    val a = BigInteger(readln())
    val b = BigInteger(readln())

    val result = (a + b + (a - b).abs()) / "2".toBigInteger()
    println(result)
}