package problems_practice.practice

fun removeElement(nums: IntArray, num: Int):Int {
    var index = 0

    for (i in 1..<nums.size){
        if(nums[index] == nums[i]){
            nums[index++] = nums[i]
        }
    }

    return index
}


fun main() {
    val arr1 = intArrayOf(0,1,2,2,3,0,4,2)

    removeElement(nums = arr1, num = 2)
    println("Arr1 : ${arr1.joinToString()}")
}