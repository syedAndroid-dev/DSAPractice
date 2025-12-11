package problems_practice.sorting

fun quickSort(array: IntArray,low : Int,high : Int){
    if(low>=high){
        return
    }

    var start = low
    var end = high
    val mid = (start+end)/2
    val pivot = array[mid]

    while (start <= end){
        while (array[start] < pivot){
            start++
        }
        while (array[end] > pivot){
            end--
        }
        if(start<=end){
            val temp = array[start]
            array[start] = array[end]
            array[end] = temp
            start++
            end--
        }
    }
    quickSort(array, low, end)
    quickSort(array,start,high)
}

fun main() {
    val arr = intArrayOf(4,3,1,2,5,9,7,10,6)

    quickSort(arr,0,arr.size-1)
    println("Sorted : ${arr.joinToString()}")
}