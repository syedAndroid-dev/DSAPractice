package problems_practice.dsa90

fun moveZeroes(arr:IntArray){

    var left = 0
    var right = 1

    while (right < arr.size){
        if(arr[right] != 0){
            val temp = arr[right]
            arr[right] = arr[left]
            arr[left] = temp
            left++
        }
        right++
    }
}


fun main() {

    val arr = intArrayOf(0,1,0,3,12)
    println("Before Change : ${arr.joinToString()}")
    moveZeroes(arr)
    println("After Change : ${arr.joinToString()}")
}