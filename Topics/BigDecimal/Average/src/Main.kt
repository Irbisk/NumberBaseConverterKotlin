import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val array = Array(3) { BigDecimal(readln()) }
    println((array.sumOf { it } / array.size.toBigDecimal()).setScale(0, RoundingMode.DOWN))
}