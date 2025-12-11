package take_you_forward.array_problems.medium


fun maximumSumSubArray(nums:IntArray):Int{
    var maxSum = Int.MIN_VALUE
    var sum = 0

    for (i in 0..<nums.size){
        sum += nums[i]

        if (sum > maxSum){
            maxSum = Math.max(maxSum,sum)
        }
        if (sum < 0){
            sum = 0
        }
    }

    return maxSum
}

fun maximumSumSubArrayWithSub(nums:IntArray):Int{
    var maxSum = Int.MIN_VALUE
    var sum = 0

    var start = 0
    var end = 0

    for (i in 0..<nums.size){

        if (sum == 0) start = i

        sum += nums[i]

        if (sum > maxSum){
            maxSum = Math.max(maxSum,sum)
            end = i
        }
        if (sum < 0){
            sum = 0
        }
    }

    println("Start : ${start} -- End : ${end}")

    return maxSum
}

fun main() {
    val arr = intArrayOf(-2,1,-3,4,-1,2,1,-5,4)

    println("Maximum Sum SubArray : ${maximumSumSubArrayWithSub(nums = arr)}")
}