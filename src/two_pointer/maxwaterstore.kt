package two_pointer

fun findMaxAmountWaterStore(arr : IntArray):Int{
    var start = 0
    var end = arr.size-1
    var max = 0
    while (start < end){
        if(arr[start] < arr[end]){
            max = Math.max(max,arr[start] * (end - start))
            start++
        } else {
            max = Math.max(max,arr[end] * (end - start))
            end--
        }
    }
    return max
}

fun main() {
    val arr = intArrayOf(1,8,6,2,5,4,8,3,7)
    println("maximum capacity to store : ${findMaxAmountWaterStore(arr = arr)}")
}