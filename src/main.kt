fun main() {
    println("DSA Check : ${reverseDigits(inputNum = 200)}")
}


fun stringToIntConverter(inputNum: String):Number{
    var num = inputNum
    var result = 0

    for (i in inputNum.indices){
        val convertedNum = inputNum[i] - '0'
        result = result * 10 + convertedNum
    }

    println(result)

    return 0
}

fun reverseDigits(inputNum: Int):Int{
    val numChangeCheck = inputNum.toString()
    var result = 0

    for (i in numChangeCheck.length -1  downTo 0){
        result = result * 10 + (numChangeCheck[i] - '0')
    }
    return result
}