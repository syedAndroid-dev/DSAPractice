package take_you_forward.array_problems.medium

fun findSubArrayLengthSubArray(nums:IntArray,k:Int):Int{
    var totalSubArraySumCount = 0

    for (i in 0..<nums.size){
        var total = 0
        for (j in i..<nums.size){
            total += nums[j]
            if (total == k){
                totalSubArraySumCount++
                break
            }
        }
    }

    return totalSubArraySumCount
}

fun main() {
    val num = intArrayOf(1,2,3)
    val k = 3

    println("Finded SubArray k : ${findSubArrayLengthSubArray(nums = num, k = k)}")
}