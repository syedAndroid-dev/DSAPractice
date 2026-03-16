package problem_solvingfrom_feb7.arrays

fun merge(input: IntArray, start: Int, mid: Int, end: Int): Int {
    val temp = IntArray(end - start + 1) { 0 }
    var left = start
    var right = mid + 1
    var k = 0
    var count = 0

    while (left <= mid && right <= end) {
        if (input[left] <= input[right]) {
            temp[k++] = input[left++]
        } else {
            temp[k++] = input[right++]
            count += (mid - left) + 1
        }
    }

    while (left <= mid) {
        temp[k++] = input[left++]
    }

    while (right <= end) {
        temp[k++] = input[right++]
    }

    for (i in start..end) {
        input[i] = temp[i - left]
    }

    return count
}


fun mergeSort(input: IntArray, start: Int, end: Int, count: Int): Int {
    var count = 0
    val mid = input.size / 2

    if (start < end) {
        count += mergeSort(input = input, start = start, end = mid, count)
        count += mergeSort(input = input, start = mid + 1, end = input.size, count)
        count += merge(input = input, start = start, mid = mid, end = end)
    }
    return count
}

fun main() {
    val arr = intArrayOf(5, 4, 3, 2, 1)
    var count = 0
    val numberOfInversion = mergeSort(
        input = arr, start = 0, end = arr.size,
        count = 0
    )

    println("Number Of Inversion : ${numberOfInversion}")

}