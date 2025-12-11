package problems_practice.dsapractice.topic_02_two_pointer

import kotlin.math.min

fun containsWithMostWater(arr : IntArray):Int{
    var start = 0
    var end = arr.size-1
    var maxArea = 0

    while (start < end){
        val area = min(arr[start],arr[end]) * (end-start)
        maxArea = maxOf(maxArea,area)
        if (arr[start]<=arr[end]){
            start++
        } else {
            end--
        }
    }

    return maxArea
}

fun main() {

    val arr = intArrayOf(1,8,6,2,5,4,8,3,7)

    println("Contains With Most Water : ${containsWithMostWater(arr = arr)}")

}