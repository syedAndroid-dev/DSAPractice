package binary_search_problems

//brute force
fun findMinimumInRotatedSortedArray(arr:IntArray):Int{
    var min = 0
    for (i in 0..<arr.size-1){
        if(arr[i] > arr[i+1]){
            min = arr[i+1]
        }
    }
    return min
}

fun findMinimumInRotatedSortedArr(arr:IntArray):Int{
    var i=0
    var j = arr.size-1
    var result = arr[0]
    while (i <= j){
        val mid = i+(j-i)/2
        if(arr[i] < arr[j]){
            result = minOf(result,arr[i])
            break
        }
        result = minOf(result,arr[mid])
        if(arr[mid]>=arr[i]){
            i = mid + 1
        } else {
            j = mid - 1
        }
    }
    return result
}

fun main() {
    val arr = intArrayOf(3,4,5,6,1,2)
    println("minimum element in array : ${findMinimumInRotatedSortedArr(arr = arr)}")
}