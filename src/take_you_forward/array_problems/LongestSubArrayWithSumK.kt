package take_you_forward.array_problems

import kotlin.math.max

fun longestSubArrayLengthWithSumK(nums: IntArray, k: Int): Int {
    var maxLength = 0

    for (i in 0..<nums.size) {
        var sum = 0
        for (j in i..<nums.size) {
            if (sum < k) {
                sum += nums[j]
            } else {
                if (sum == k) {
                    maxLength = Math.max(maxLength, j - i)
                }
                break
            }
        }
    }

    return maxLength
}

fun longestSubArrayLengthWithSumKTwoPointer(nums: IntArray, k: Int): Int {
    var maxLength = 0
    var sum = nums[0]
    var left = 0
    var right = 0

    while (right < nums.size) {

        while (left <= right && sum>k) {
            sum -= nums[left]
            left++
        }
        if (sum == k) {
            maxLength = max(maxLength, right - left + 1)
        }

        right++
        if (right < nums.size) {
            sum += nums[right]
        }
    }

    return maxLength
}


fun main() {
    val arr = intArrayOf(2, 3, 5, 1, 9)

    println("Longest SubArrayLength Sum : ${longestSubArrayLengthWithSumKTwoPointer(nums = arr, k = 10)}")
}