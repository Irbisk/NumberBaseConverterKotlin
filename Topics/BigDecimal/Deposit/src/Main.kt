import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val startingAmount = BigDecimal(readln())
    val yearlyPercent = BigDecimal(readln())
    val years = BigDecimal("3.3")

    val finalAmount = startingAmount * (BigDecimal.ONE + yearlyPercent.setScale(2 + yearlyPercent.scale()) / 100.0.toBigDecimal()).pow(years)
    println("Amount of money in the account: ${finalAmount.setScale(2, RoundingMode.CEILING)}")

}


