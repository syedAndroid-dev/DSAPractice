package binary_search_problems

fun searchElementIn2DArray(arr: Array<Array<Int>>, target: Int): Boolean {
    var row = 0
    while (row < arr.size) {
        var i = 0
        var j = arr[row].size - 1
        if (arr[row][0] <= target || arr[row][arr[row].size-1] >= target) {
            while (i <= j) {
                val mid = i + (j - i) / 2
                if (arr[row][mid] == target) {
                    return true
                } else if (arr[row][mid] < target) {
                    i = mid + 1
                } else {
                    j = mid - 1
                }
            }
            row++
        } else {
            row++
        }
    }

    return false
}


fun main() {

    val arr: Array<Array<Int>> = arrayOf(
        arrayOf(1, 3, 5, 7),
        arrayOf(10, 11, 16, 20),
        arrayOf(23, 30, 34, 60),
    )
    val target = 30

    println("given element target is : $target is : ${searchElementIn2DArray(arr, target)}")
}