package take_you_forward.array_problems

fun longestConsecutiveOne(nums:IntArray):Int{

    var maxCount = 0
    var count = 0

    for (i in 0..<nums.size){
        if (nums[i] == 0){
            count = 0
        } else {
            count++
        }

        maxCount = Math.max(maxCount,count)
    }

    return maxCount
}

fun main() {
    val arr = intArrayOf(1,1,0,1,1,1)

    println("Longest ConsecutiveOne is : ${longestConsecutiveOne(nums = arr)}")
}