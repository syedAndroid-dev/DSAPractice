package take_you_forward.array_problems.hard

fun majorityElement2(nums:IntArray):List<Int>{

    val n = nums.size
    val result : MutableList<Int> = mutableListOf()

    for (i in nums.indices){
        if (result.isEmpty() || (result[0] != nums[i] && (result.size < 2 || result[1] != nums[i]))){
            var count = 0
            for (element in nums){
                if (element == nums[i]){
                    count++
                }
            }

            if (count > n/3){
                result.add(nums[i])
            }
        }

        if (result.size == 2){
            break
        }
    }

    return result
}

fun majorityElementTwo(nums: IntArray): List<Int> {
    val n = nums.size
    val result = mutableListOf<Int>()

    for (i in nums.indices) {
        // Check if nums[i] is not already part of the result
        if (result.isEmpty() ||
            (result[0] != nums[i] && (result.size < 2 || result[1] != nums[i]))
        ) {
            var count = 0
            for (j in nums.indices) {
                if (nums[j] == nums[i]) {
                    count++
                }
            }
            if (count > n / 3) {
                result.add(nums[i])
            }
        }

        if (result.size == 2) break
    }

    return result
}


fun main() {
    val nums = intArrayOf(1, 2, 1, 1, 3, 2, 2)

    println("Majority : ${majorityElement2(nums = nums)}")
}