package take_you_forward.array_problems.medium


fun leadersInArray(nums: IntArray){
    val result = IntArray(nums.size)
    var resultIndex = 0

    for (i in 0..<nums.size){
        var isLeader = true
        for (j in i+1..<nums.size){
            if (nums[j] > nums[i]){
                isLeader = false
            }
        }
        if (isLeader){
            result[resultIndex++] = nums[i]
        }
    }

    result.forEachIndexed { index, i ->
        nums[index] = i
    }
}

fun leadersArrayOptimized(nums: IntArray){
    val result = IntArray(nums.size)
    var resultIndex = 0
    var maximum = Int.MIN_VALUE

    for (i in nums.size-1 downTo 0){
        if (nums[i] > maximum){
            maximum = nums[i]
            result[resultIndex++] = maximum
        }
    }

    result.reversedArray().forEachIndexed { index, i ->
        nums[index] = i
    }
}

fun main() {
    val arr = intArrayOf(1, 2, 5, 3, 1, 2)
    println("Before Leaders Arr : ${arr.joinToString()}")
    leadersArrayOptimized(nums = arr)
    println("After Leaders Arr : ${arr.joinToString()}")
}