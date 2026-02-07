package take_you_forward.array_problems.hard

fun longestLengthOfSubArray(arr : IntArray,target:Int):Int{
    var maxSumLength = 0

    for (i in 0 until arr.size){
        var sum = arr[i]
        for (j in i+1 until arr.size){
            sum += arr[j]
            if (sum == target){
                maxSumLength = maxSumLength.coerceAtLeast(j - i)
                println("I -> ${i} J -> ${j} size : ${arr.size}")
            }
        }
    }

    println("Maximum Length : ${maxSumLength}")

    return maxSumLength+1
}

fun maximumLengthSubArraySum0(arr: IntArray):Int{
    var maximumLength = 0
    var sum = 0
    val prefixSumHmap : MutableMap<Int,Int> = mutableMapOf<Int,Int>()

    for (i in 0 until arr.size){
        sum += arr[i]

        if(sum == 0){
            maximumLength = i+1
        } else if(prefixSumHmap.containsKey(sum)){
            maximumLength = Math.max(maximumLength,i-prefixSumHmap.getOrDefault(sum,0))
        } else {
            prefixSumHmap[sum] = i
        }
    }

    return maximumLength
}

fun main() {
    val arr = intArrayOf(9, -3, 3, -1, 6, -5)
    var target = 0

    println("Longest Length Of SubArray : ${longestLengthOfSubArray(arr,target)}")

}