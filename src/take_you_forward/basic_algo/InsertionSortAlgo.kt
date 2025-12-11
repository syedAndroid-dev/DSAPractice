package take_you_forward.basic_algo

/**
Select The Element and place to the correct order in sorted portion

Time Complexity - O(n2)
Space - O(1)
 **/


fun insertionSortAlgo(array: IntArray){
    for (i in 0..<array.size){
        var j = i
        while (j > 0 && array[j] < array[j-1]){
            val temp = array[j-1]
            array[j-1] = array[j]
            array[j] = temp
            j--
        }
    }
}

fun main() {
    val arr = intArrayOf(5,8,2,4,3)

    println("before Sort : ${arr.joinToString()}")
    insertionSortAlgo(array = arr)
    println("After Sort : ${arr.joinToString()}")
}