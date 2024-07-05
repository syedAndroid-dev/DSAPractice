package binary_search_problems

fun binarySearch(arr: IntArray, target: Int,start:Int,end : Int): Int {
    var i = start
    var j = end
    while (start <= j) {
        val mid = i + (j - i) / 2
        if (arr[mid] == target) {
            return mid
        }
        if(arr[mid]> target){
            j = mid-1
        } else {
            i = mid+1
        }
    }
    return -1
}

fun findPivotIndex(arr: IntArray): Int {
    var left = 0
    var right = arr.size - 1
    while (left <= right) {
        val mid = left + (right - left) / 2

        if (mid < right && arr[mid] > arr[mid + 1]) {
            return mid
        }

        if (mid > left && arr[mid] < arr[mid - 1]) {
            return mid - 1
        }

        if (arr[mid] <= arr[left]) {
            right = mid - 1
        } else {
            left = mid + 1
        }
    }
    return -1
}

fun main() {
    val arr = intArrayOf(3, 4, 5, 6, 1, 2)
    val target = 1

    val pivotIndex = findPivotIndex(arr)
    println("pivotIndex : ${pivotIndex}")

    if(arr[pivotIndex] > target){
        println("result : ${binarySearch(arr = arr, target = target, start = pivotIndex+1, end = arr.size-1)}")
    }else{
        println("result : ${binarySearch(arr = arr, target = target, start = 0, end = pivotIndex)}")
    }
}