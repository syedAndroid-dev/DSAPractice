package take_you_forward.array_problems.hard



fun main() {


    val arr = intArrayOf(4, 2, 2, 6, 4)
    val n = 6
    var maxSubArrayCount = 0

    for (i in 0 until arr.size){
        var sumCount = 0
        for(j in i until arr.size){
            sumCount = sumCount xor arr[j]
            if (sumCount == n){
                println("Founded Xor SubArray : ${i} ${j} -- ${arr.joinToString()}")
                maxSubArrayCount++
            }
        }
    }
    println("Sub Array Count Xor num : ${maxSubArrayCount}")
}