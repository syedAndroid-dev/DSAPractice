package problems_practice.basics_arrays_hashing

fun moveZeroes(arr: IntArray):IntArray{
    for (i in arr.indices){
        for (j in i+1..<arr.size){
            if (arr[i] == 0 && arr[j] != 0){
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
    }
    return arr
}

fun moveZeroTwoPointerApproach(arr: IntArray):IntArray{
    var left = 0
    var right = 0
    while (right < arr.size){
        if (arr[right] != 0){
            val temp = arr[left]
            arr[left] = arr[right]
            arr[right] = temp
            left++
        }
        right++
    }
    return arr
}

data class Name(
    val name : String,
    val age : Int
)

class SuperName{


}




fun main() {
    val arr = intArrayOf(0,1,0,3,12)

    println("Before Rearranging : ${arr.joinToString()}")
    println("After Arranging : ${moveZeroTwoPointerApproach(arr = arr).joinToString()}")
}