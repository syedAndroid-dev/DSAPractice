package problems_practice.hmap

fun containsDuplicate(nums:IntArray):Boolean{
    val frequencyHashmap = mutableMapOf<Int,Int>()

    for(i in 0 until nums.size){
        if(frequencyHashmap.containsKey(nums[i])){
            return false
        }
        frequencyHashmap[nums[i]] = frequencyHashmap.getOrDefault(nums[i],0)+1
    }

    return true
}

fun main() {
    val nums = intArrayOf(1,2,3,1)
    println("is All Element Unique : ${containsDuplicate(nums)}")
}