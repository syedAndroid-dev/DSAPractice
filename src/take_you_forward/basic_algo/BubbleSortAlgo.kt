package take_you_forward.basic_algo

/**
Select The Maximum and swap to last

Time Complexity - O(n2)
Space - O(1)
 **/


fun bubbleSortAlgo(array: IntArray){
    for (i in array.size-1 downTo 0){
        var maxElement = 0
        for (j in 1..i){
            if (array[j] > array[maxElement]){
                maxElement = j
            }
        }

        val temp = array[i]
        array[i] = array[maxElement]
        array[maxElement] = temp
    }
}

fun main() {
    val arr = intArrayOf(5,8,2,4,3)

    println("before Sort : ${arr.joinToString()}")
    bubbleSortAlgo(array = arr)
    println("After Sort : ${arr.joinToString()}")
}