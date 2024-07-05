package binary_search_problems


fun medianTwoSortedArray(arr1 : IntArray,arr2 : IntArray):Double{
    val mergedArr = IntArray(arr1.size+arr2.size){ 0 }

    var i = 0
    var j = 0


    return mergedArr.sum()/(mergedArr.size).toDouble()
}

fun main() {

    val arr1 = intArrayOf(1,3)
    val arr2 = intArrayOf(2)

    println("Median of two sorted array is : ${medianTwoSortedArray(arr1, arr2)}")
}