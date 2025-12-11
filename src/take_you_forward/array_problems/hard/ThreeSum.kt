package take_you_forward.array_problems.hard

fun threeSum(nums:IntArray){  //:Array<IntArray>

    val twoSumRemainingHeap : MutableMap<Int,IntArray> = mutableMapOf()

    //Fist Find Difference of all combination
    for (i in 0..<nums.size){
        for (j in i..<nums.size){
            val addition = nums[i] + nums[j]
            twoSumRemainingHeap[addition] = intArrayOf(i,j)
        }
    }

    println("Hmap : ")
    twoSumRemainingHeap.forEach{ println("key : ${it.key} -- value : ${it.value.joinToString()} ") }

    for (i in 0..<nums.size){
        if (twoSumRemainingHeap.containsKey(nums[i])){
            println("Ans : ${nums[i]} ${twoSumRemainingHeap[nums[i]]?.joinToString()}")
        }
    }
}

fun main() {
    val nums = intArrayOf(-1,0,1,2,-1,-4)
    println("Three Sum 0 Number : ${threeSum(nums = nums)}")
}