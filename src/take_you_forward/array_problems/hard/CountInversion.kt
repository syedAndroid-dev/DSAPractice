package take_you_forward.array_problems.hard


// Count Inversion Using Merge Sort
// Inversion - {5,3,1,2,10,9} -> Count -> 2 - (5,3)-(10,9)

fun merge(arr: IntArray, left: Int, mid: Int, right: Int): Int {
    val temp = IntArray(right - left + 1)

    var i = left
    var j = mid + 1
    var k = 0

    var count = 0

    while (i <= mid && j <= right) {
        if (arr[i] <= arr[j]) {
            temp[k++] = arr[i++]
        } else {
            temp[k++] = arr[j++]
            count += 1
        }
    }

    while (i <= mid) {
        temp[k++] = arr[i++]
    }

    while (j <= right) {
        temp[k++] = arr[j++]
    }

    for (index in temp.indices) {
        arr[left + index] = temp[index]
    }

    return count
}

fun mergeSort(arr: IntArray, left: Int, right: Int): Int {
    var count = 0
    if (left < right) {
        val mid = left + (right - left) / 2
        count += mergeSort(arr = arr, left = left, right = mid)
        count += mergeSort(arr = arr, left = mid + 1, right = right)

        count += merge(arr = arr, left = left, right = right, mid = mid)
    }
    return count
}

fun main() {
    val arr = intArrayOf(5, 3, 1, 2, 10, 9)

    println("Before Sorting : ${arr.joinToString()}")
    println("Inversion Count : ${mergeSort(arr = arr, left = 0, right = arr.size - 1)}")
    println("After Sorting : ${arr.joinToString()}")

}