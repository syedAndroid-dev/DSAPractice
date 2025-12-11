package take_you_forward.array_problems


fun moveZeroToEnd(array: IntArray){
    for (i in 0..<array.size){
        if (array[i] == 0){
            for (j in i..<array.size-1){
                val temp = array[j]
                array[j] = array[j+1]
                array[j+1] = temp
            }
        }
    }
}

fun moveZeroToEndTwoPointer(array: IntArray){
    //[1, 2, 0, 4, 3, 0, 5, 0]
    var zeroThIndex = 0

    for (i in 0..<array.size){
        if (array[i] != 0){
            val temp = array[zeroThIndex]
            array[zeroThIndex] = array[i]
            array[i] = temp
            zeroThIndex++
        }
    }
}



fun main() {
    val arr = intArrayOf(1,0,2,3,0,4,0,1)

    println("Before : ${arr.joinToString()}")
    moveZeroToEndTwoPointer(array = arr)
    println("After : ${arr.joinToString()}")
}