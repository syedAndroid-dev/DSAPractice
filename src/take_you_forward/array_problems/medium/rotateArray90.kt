package take_you_forward.array_problems.medium

fun rotateArray90Deg(nums:Array<IntArray>){
    val n = nums.size-1
    println("Size : ${n}")
    for (i in 0..<nums.size-1){

        for (j in i+1..<nums.size){
            val temp = nums[i][j]
            nums[i][j] = nums[j][i]
            nums[j][i] = temp
        }
    }
    println("After Transpose..")
    for (row in nums) {
        println(row.joinToString(" "))
    }

    for (i in 0..n){
        reverseArray(nums = nums[i])
    }

    println("Reverse Array")
    for (row in nums) {
        println(row.joinToString(" "))
    }
}

fun reverseArray(nums: IntArray){
    println("Rev Check : ${nums.joinToString(" ")}")
    var start = 0
    var end = nums.size-1

    while (start<end){
        val temp = nums[start]
        nums[start] = nums[end]
        nums[end] = temp
        start++
        end--
    }
}


fun main() {

    val arr = arrayOf(
        intArrayOf(5,1,9,11),
        intArrayOf(2,4,8,10),
        intArrayOf(13,3,6,7),
        intArrayOf(15,14,12,16),
    )

    println("Before Printing..")
    for (row in arr) {
        println(row.joinToString(" "))
    }

    rotateArray90Deg(arr)

    println("After Printing..")
    for (row in arr) {
        println(row.joinToString(" "))
    }
}