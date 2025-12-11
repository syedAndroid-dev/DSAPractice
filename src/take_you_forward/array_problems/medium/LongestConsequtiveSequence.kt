package take_you_forward.array_problems.medium

fun longestConsecutiveSequence(nums:IntArray):Int{
    val hSet = mutableSetOf<Int>()

    for (i in nums){
        hSet.add(i)
    }

    var longestCount = 1

    for (j in 0..<nums.size){
        if (!hSet.contains(nums[j]-1)){
            var count = 1
            var num = nums[j]
            while (hSet.contains(num+1)){
                num += 1
                count +=1
            }
            longestCount = Math.max(longestCount,count)
        }
    }

    return longestCount
}

fun main() {
    val num = intArrayOf(0,3,7,2,5,8,4,6,0,1)
    println("Longest Consecutive Sequence : ${longestConsecutiveSequence(nums = num)}")
}