package problems_practice.dsa90

import kotlin.math.max
import kotlin.math.min

fun insertInterval(array: Array<IntArray>, target: IntArray): Array<IntArray> {

    val resultArr = Array<IntArray>(array.size) { IntArray(2) }
    //val resultArr = Array(array.size) { intArrayOf() }
    var restArrPos = 0
    var currArrPosition = 0

    while (currArrPosition < array.size && array[currArrPosition][1] < target[0]) {
        resultArr[restArrPos++] = array[currArrPosition++]
    }

    while (currArrPosition < array.size && array[currArrPosition][0] <= target[1]) {
        target[0] = min(target[0], array[currArrPosition][0])
        target[1] = max(target[1], array[currArrPosition][1])
        currArrPosition++
    }
    resultArr[restArrPos++] = target

    while (currArrPosition < array.size) {
        resultArr[restArrPos++] = array[currArrPosition++]
    }
    return resultArr
}

fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
    val result = Array(intervals.size) { intArrayOf() }
    var restArrPos = 0
    var currArrPosition = 0

    while (currArrPosition < intervals.size && intervals[currArrPosition][1] < newInterval[0]) {
        result[restArrPos++] = intervals[currArrPosition++]
    }

    while (currArrPosition < intervals.size && intervals[currArrPosition][0] <= newInterval[1]) {
        newInterval[0] = min(newInterval[0], intervals[currArrPosition][0])
        newInterval[1] = max(newInterval[1], intervals[currArrPosition][1])
        currArrPosition++
    }
    result[restArrPos++] = newInterval
    println("Rest : ${result[restArrPos-1][0]} ${result[restArrPos-1][1]}")

    while (currArrPosition < intervals.size) {
        result[restArrPos++] = intervals[currArrPosition++]
    }
    return result
}

fun main() {
    val arr = arrayOf(intArrayOf(1, 2), intArrayOf(3, 5), intArrayOf(6, 7), intArrayOf(8, 10), intArrayOf(12, 16))
    val target = intArrayOf(4, 8)

    arr.forEach { print("${it.joinToString()} --") }
    println("Arr Before : ")

    println("After Insert : ")
    insertInterval(array = arr, target = target).forEach { print("${it.joinToString()} --") }

}