fun main() {
    val a = readln().toBigInteger()
    val b = readln().toBigInteger()
    val q = a / b
    val r = a % b
    val  result = b * q + r
    println("$result = $b * $q + $r")
}