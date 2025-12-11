package take_you_forward.array_problems

fun findTheNumberAppearOnceTwiceRepeated(array: IntArray):Int{
    for (i in 0..<array.size){

        var frequencyCount = 0

        for (j in 0..<array.size){
            if (array[i] == array[j]){
                frequencyCount++
            }
        }

        if (frequencyCount == 1){
            return array[i]
        }
    }
    return -1
}

fun findTheNumberAppearOnceTwiceRepeatedHMap(array: IntArray):Int{
    val hMap = hashMapOf<Int,Int>()
    for (i in 0..<array.size){

    }
    return -1
}

fun main() {
    val arr = intArrayOf(4,1,2,1,2)

    println("Frequency Count Check : ${findTheNumberAppearOnceTwiceRepeated(arr)}")

}