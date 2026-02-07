package take_you_forward.array_problems.hard

fun longestSubArrayWithSumZero(nums:IntArray):Int{
    var maxSubArrayLength = -1

    for (i in 0 until nums.size){
        var sum = nums[i]
        for (j in i+1 until nums.size){
            sum += nums[j]

            if (sum == 0){
                maxSubArrayLength = Math.max(maxSubArrayLength,j-i)
            }
        }
    }

    return maxSubArrayLength+1
}

fun main() {
    val nums = intArrayOf(6, -2, 2, -8, 1, 7, 4, -10)   //(9, -3, 3, -1, 6, -5)

    println("Longest SubArray Length Sum Zero is : ${longestSubArrayWithSumZero(nums = nums)}")
}