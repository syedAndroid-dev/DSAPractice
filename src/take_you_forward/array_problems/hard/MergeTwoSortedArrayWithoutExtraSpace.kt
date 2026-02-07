package take_you_forward.array_problems.hard

fun mergeTwoSortedArray(arr1: IntArray, arr2: IntArray, m: Int, n: Int) {
    var i = m - 1
    var j = n - 1
    var k = m + n - 1

    while (j >= 0) {
        if (i >= 0 && arr1[i] > arr2[j]) {
            arr1[k--] = arr1[i--]
        } else {
            arr1[k--] = arr2[j--]
        }
    }
}

fun main() {
    val arr1 = intArrayOf(-5, -2, 4, 5, 0, 0, 0)
    val arr2 = intArrayOf(-3, 1, 8)

    mergeTwoSortedArray(arr1, arr2, m = 4, n = 3)

    println("After Sorting Array : ${arr1.joinToString()}")
}