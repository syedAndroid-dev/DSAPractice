package problems_practice.slidingwindow

fun longestSubStringLength(input:String):Int{
    val inputLength = input.length-1
    var maxSum = Int.MIN_VALUE

    for (i in 0 until inputLength){
        val uniqueHashSet = mutableSetOf<Char>()
        for (j in i+1 until inputLength){
            if (!uniqueHashSet.contains(input[j])){
                uniqueHashSet.add(input[j])
                maxSum = Math.max(maxSum,j-i)
            } else {
                break
            }
        }
    }
    return maxSum
}

fun longestSubStringLengthOptimal(input:String):Int{
    val uniqueHashSet = mutableSetOf<Char>()
    val inputLength = input.length
    var left = 0
    var right = 0
    var maxSum = 0

    while (right<inputLength){
        if (uniqueHashSet.contains(input[right])){
            val currentSubStringLength = right-left
            maxSum = Math.max(maxSum,currentSubStringLength)
            left++
        }
        uniqueHashSet.add(input[right])
        right++
    }
    return maxSum
}

fun main() {
    val input = "pwwkew"

    println("Longest SubString Length : ${longestSubStringLengthOptimal(input = input)}")
}