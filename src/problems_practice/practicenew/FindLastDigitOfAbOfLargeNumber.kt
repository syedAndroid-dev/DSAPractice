package problems_practice.practicenew


fun getLastDigit(a: String, b: String): Int {
    // code here
    var num1 = 0
    var num2 = 0

    for (i in 0..<a.length) {
        val c = a[i]
        val num = c.code - '0'.code
        num1 = num1 * 10 + num
    }

    for (i in 0..<b.length) {
        val c = b[i]
        val num = c.code - '0'.code
        num2 = num2 * 10 + num
    }

    return power(num1, num2) % 10
}

fun power(num: Int, root: Int): Int {
    var result = 1
    for (i in 0..<root) {
        result *= num
    }

    return result
}

fun main() {
    var a = "3"
    var b = "10"

    println("Last Digit Num : ${getLastDigit(a, b)}")
}