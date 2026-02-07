package revision

class Person{
    companion object {
        val name = "Syed"
    }
}



fun findMaximumSum(input:IntArray):Int{
    var maxSum = Int.MIN_VALUE
    var sum = 0

    for (i in input.indices){
        sum += input[i]
        maxSum = Math.max(sum,maxSum)

        if (sum < 0){
            sum = 0
        }
    }

    return maxSum
}

fun main() {

    val num = intArrayOf(-2,1,-3,4,-1,2,1,-5,4)

    Person.name
    println("Maximum SUM : ${findMaximumSum(input = num)}")
}