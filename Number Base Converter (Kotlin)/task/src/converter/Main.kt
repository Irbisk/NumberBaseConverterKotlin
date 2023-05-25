package converter

import java.math.BigDecimal
import kotlin.math.pow

fun main() {
    while (true) {
        println("Enter two numbers in format: {source base} {target base} (To quit type /exit)")
        val command = readln()
        if (command == "/exit") {
            break
        } else {
            val bases = command.split(" ").map { it.toInt() }
            while (true) {
                println("Enter number in base ${bases[0]} to convert to base ${bases[1]} (To go back type /back)")
                val number = readln()
                if (number == "/back") {
                    break
                } else {
                    println("Conversion result: ${convert(bases[0], bases[1], number)}\n")
                }
            }
        }
    }
}

fun convert(source: Int, target: Int, number: String): String {
    return if (number.contains('.')) {
        val intPart = number.split(".")[0]
        val fracPart = number.split(".")[1]
        convertIntPart(source, target, intPart) + "." + convertFractional(source, target, fracPart)
    } else {
        convertIntPart(source, target, number)
    }
}

fun convertIntPart(source: Int, target: Int, number: String): String {
    return number.toBigInteger(source).toString(target)
}

fun convertFractional(source: Int, base: Int, number: String): String {
    var degree = -1.0
    var dec = BigDecimal.ZERO
    for (i in 0..number.lastIndex) {
        val value = if (number[i].code > 96) {
            (number[i].code - 87).toBigDecimal()
        } else number[i].toString().toBigDecimal()
        dec += value * source.toDouble().pow(degree--).toBigDecimal()
    }

    if (dec.toString().matches("0E.+".toRegex())) {
        return "00000"
    } else {
        var result = ""
        var count = 0
        var value = dec * base.toBigDecimal()
        while (value.toString().contains('.') && count < 5) {
            val leftPart = value.toBigInteger().toString(base)
            result += leftPart
            value = (value - value.toBigInteger().toBigDecimal()) * base.toBigDecimal()
            count++
        }
        while (result.length < 5) {
            result += "0"
        }
        return result
    }
}