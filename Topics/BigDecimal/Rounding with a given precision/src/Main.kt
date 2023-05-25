import java.math.BigDecimal
import java.math.RoundingMode

fun main() {             
    var a = BigDecimal(readln())
    var b = readln().toInt()
    println(a.setScale(b, RoundingMode.HALF_DOWN))

}