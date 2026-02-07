package take_you_forward.array_problems.hard

fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
    var result: MutableList<List<Int>> = mutableListOf()
    nums.sort()
    val numSize = nums.size - 1

    for (i in 0..numSize) {
        if (i > 0 && nums[i] == nums[i - 1]) continue
        for (j in i + 1..numSize) {
            if (j > i + 1 && nums[j] == nums[j - 1]) continue

            var left = j + 1
            var right = numSize

            while (left < right) {

                val sum = nums[i].toLong() + nums[j].toLong() + nums[left].toLong() + nums[right].toLong()

                if (sum == target.toLong()) {
                    result.add(mutableListOf(nums[i], nums[j], nums[left], nums[right]))
                    while (left < right && nums[left] == nums[left + 1]) left++
                    while (left < right && nums[right] == nums[right - 1]) right--
                    left++
                    right--
                } else if (sum < target) {
                    left++
                } else {
                    right--
                }
            }
        }
    }

    return result
}

fun main() {
    val nums = intArrayOf(1000000000,1000000000,1000000000,1000000000) // [-2,-1,0,0,1,2]


    println("Four Sum : ${nums.size}")
    println(
        "Nums Check : ${
            fourSum(nums,10).joinToString { it.joinToString() }
        }"
    )
}