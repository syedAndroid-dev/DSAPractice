package take_you_forward.array_problems

fun findLargestElementInArray(input:IntArray):Int{

    var largestElement = Int.MIN_VALUE

    for (i in 0..<input.size){
        largestElement = Math.max(largestElement,input[i])
    }

    return largestElement
}



fun main() {
    println("Largest Element : ${findLargestElementInArray(intArrayOf(5,10,55,1,66))}")
}