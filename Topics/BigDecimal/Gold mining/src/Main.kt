import java.math.BigDecimal

fun main() {      
    val array = Array(3) { BigDecimal(readln()) }
    println(array.sumOf { it })

}