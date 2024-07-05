package sorting

fun bubbleSortAlgorithm(arr: List<Int>) {
    val result = arr.toMutableList()
    val arrSize = arr.size
    for (i in 0..<arrSize){
        for(j in 0..<arrSize-i-1){
            if(result[j] > result[j+1]){
                val temp = result[j]
                result[j] = result[j+1]
                result[j+1] = temp
            }
        }
    }

    println("after sorting : $result")
}

fun main() {
    val arr = listOf(8, 1, 4, 7, 2, 6, 3, 5)

    println("before sorting : $arr")
    bubbleSortAlgorithm(arr = arr)
}