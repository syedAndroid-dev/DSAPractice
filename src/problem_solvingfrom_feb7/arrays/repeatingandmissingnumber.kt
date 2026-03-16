package problem_solvingfrom_feb7.arrays

fun findRepeatingAndMissingNumber(nums:IntArray):IntArray{
    var repeatedNumber = -1
    var missingNumber = -1

    for (i in 1..nums.size){
        var count = 0
        for (j in nums){
            if (i == j){
                count++
            }


        }
        if (count > 1){
            repeatedNumber = i
        }
        if (count == 0){
            missingNumber = i
        }

        if(repeatedNumber != -1 && missingNumber != -1){
            break
        }
    }

    return intArrayOf(repeatedNumber,missingNumber)

}

fun main() {
    val arr = intArrayOf(1, 2, 3, 6, 7, 5, 7)
    val num = intArrayOf(1,2,3,4,5)
    println("Find Repeating Number : ${findRepeatingAndMissingNumber(nums = arr).joinToString()}")
}