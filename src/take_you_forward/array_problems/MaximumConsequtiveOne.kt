package take_you_forward.array_problems


fun maximunConsequtiveOne(array: IntArray):Int{
    var count = 0
    var maxCount = 0

    for (i in 0..<array.size){
        if (array[i] == 1){
            count++
        } else {
            count = 0
        }

        maxCount = Math.max(maxCount,count)
    }

    return maxCount
}

fun main() {
    val arr = intArrayOf(1,1,1,1,0,1,1,1)

    println("Maximum Frequent Count : ${maximunConsequtiveOne(array = arr)}")
}