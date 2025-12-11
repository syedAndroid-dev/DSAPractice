package take_you_forward.basic_algo

fun mergeSort(array: IntArray, low: Int, high: Int) {

    if (low >= high) return
    val mid = (low+high) / 2
    mergeSort(array = array, low = low, high = mid)
    mergeSort(array = array, low = mid + 1, high = high)
    mergeArr(array = array, low = low, mid = mid, high = high)
}

fun mergeArr(array: IntArray, low: Int, mid: Int, high: Int) {
    val temp = IntArray(high-low+1)
    var tempIndex = 0
    var start = low
    var right = mid+1

    while (start <= mid && right <= high) {
        temp[tempIndex++] = if (array[start] <= array[high]) array[start++] else array[right++]
    }

    while (start <= mid) {
        temp[tempIndex++] = array[start++]
    }

    while (right <= high) {
        temp[tempIndex++] = array[right++]
    }

//    for (i in low..high) {
//        array[i] = temp[i - low]
//    }

    // copy temp back to original array
    for (t in temp.indices) {
        array[low + t] = temp[t]
    }

}

fun main() {
    val arr = intArrayOf(5, 2, 4, 1, 0)
    println("Before Merge Sort : ${arr.joinToString()}")
    mergeSort(array = arr, low = 0, high = arr.size-1)
    println("After Merge Sort : ${arr.joinToString()}")
}


//fun mergeSort(array: IntArray, low: Int, high: Int) {
//
//    if (low >= high) return   // base condition
//
//    val mid = (low + high) / 2
//
//    mergeSort(array, low, mid)
//    mergeSort(array, mid + 1, high)
//
//    mergeArr(array, low, mid, high)
//}
//
//fun mergeArr(array: IntArray, low: Int, mid: Int, high: Int) {
//
//    val temp = IntArray(high - low + 1)
//    var i = low
//    var j = mid + 1
//    var k = 0
//
//    // merge two sorted halves
//    while (i <= mid && j <= high) {
//        temp[k++] = if (array[i] <= array[j]) array[i++] else array[j++]
//    }
//
//    // copy remaining left half
//    while (i <= mid) {
//        temp[k++] = array[i++]
//    }
//
//    // copy remaining right half
//    while (j <= high) {
//        temp[k++] = array[j++]
//    }
//
//    // copy temp back to original array
//    for (t in temp.indices) {
//        array[low + t] = temp[t]
//    }
//}
//
//fun main() {
//    val arr = intArrayOf(5, 2, 4, 1, 0)
//    println("Before Merge Sort : ${arr.joinToString()}")
//    mergeSort(arr, 0, arr.size - 1)
//    println("After Merge Sort : ${arr.joinToString()}")
//}
