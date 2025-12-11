package problems_practice.dsapractice.topic_02_two_pointer

import kotlin.math.max
import kotlin.math.min

fun tappingRainWater(nums : IntArray):Int{

    val maxLeftArr = IntArray(nums.size){ 0 }
    val maxRightArr = IntArray(nums.size){ 0 }
    var result = 0
    for (i in 1..<nums.size){
        maxLeftArr[i] = max(maxLeftArr[i-1],nums[i-1])
    }

    for (i in nums.size-2 downTo 0){
        maxRightArr[i] = max(maxRightArr[i+1],nums[i+1])
    }

    for (i in nums.indices){
        val res = min(maxLeftArr[i],maxRightArr[i]) - nums[i]
        if( res> 0){
            result += res
        }
    }

    return result
}

fun tappingRainWaterTwoPointer(arr : IntArray):Int{
    var ans = 0
    var left = 0
    var right = arr.size-1
    var maxLeft = arr[left]
    var maxRight = arr[right]

    while (left < right){
        if (maxLeft < maxRight){
            left++
            maxLeft = max(maxLeft,arr[left])
            ans += maxLeft - arr[left]
        } else {
            right--
            maxRight = max(maxRight,arr[right])
            ans += maxRight-arr[right]
        }
    }
    return ans
}


fun main() {
    val arr = intArrayOf(4,2,0,3,2,5)
    //println("Tapping Rain Water : ${tappingRainWater(nums = arr)}")
    println("Tapping Rain Water : ${tappingRainWaterTwoPointer(arr = arr)}")
}