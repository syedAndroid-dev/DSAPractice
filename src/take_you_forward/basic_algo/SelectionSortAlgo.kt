package take_you_forward.basic_algo

/**
 Select The Minimum and swap to first

 Time Complexity - O(n2)
 Space - O(1)
**/
fun selectionSortAlgo(input:IntArray){

    for(i in input.indices){
        var min = i
        for(j in i+1..<input.size){
            if (input[j] < input[min]){
                min = j
            }
        }

        val temp = input[min]
        input[min] = input[i]
        input[i] = temp
    }
}

fun main() {
    val inputNum = intArrayOf(5,2,1,3)

    println("Before Sorting : ${inputNum.joinToString()}")
    selectionSortAlgo(inputNum)
    println("After Sorting : ${inputNum.joinToString()}")
}