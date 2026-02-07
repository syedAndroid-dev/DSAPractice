package take_you_forward.array_problems.hard

fun threeSum(arr:IntArray): List<List<Int>> {

    // Store unique triplets
    val st = HashSet<List<Int>>()
    val n = arr.size

    // First loop for first element
    for (i in 0 until n) {
        // Second loop for second element
        for (j in i + 1 until n) {
            // Third loop for third element
            for (k in j + 1 until n) {
                // If triplet sum is zero
                if (arr[i] + arr[j] + arr[k] == 0) {
                    // Create sorted triplet
                    val temp = listOf(arr[i], arr[j], arr[k]).sorted()
                    st.add(temp)
                }
            }
        }
    }

    // Convert set to list
    return st.toList()
//    val resultHSet = mutableSetOf<List<Int>>()
//    val numSize= nums.size
//
//    for (i in 0..<numSize){
//        for (j in i+1..<numSize){
//            for (k in j+1..<numSize){
//                if (nums[i]+nums[j]+nums[k] == 0){
//                    val arr = listOf(nums[i],nums[j],nums[k])
//                    arr.sorted()
//                    resultHSet.add(element = arr)
//                }
//            }
//        }
//    }
//
//    println("Result : ${resultHSet.joinToString()}")
//
//    return resultHSet.map { it.toIntArray() }.toTypedArray()
}

fun threeSumOptimal(nums:IntArray): List<List<Int>> {
    val numSize = nums.size-1
    val ans : MutableSet<List<Int>> = hashSetOf()

    for (i in 0..numSize){
        val hashSet = hashSetOf<Int>()
        for (j in i+1..numSize){
            val third = -(nums[i]+nums[j])

            if (hashSet.contains(third)){
                val temp : MutableList<Int> = mutableListOf(nums[i],nums[j],third)
                temp.sort()
                ans.add(temp)
            }

            hashSet.add(nums[j])
        }
    }

    return ans.toList()
}

fun threeSumTwoPointer(nums:IntArray): List<List<Int>> {
    nums.sorted()
    val ans : MutableList<List<Int>> = mutableListOf()
    for (i in 0..<nums.size){
        if (i>0 && nums[i] == nums[i-1]) continue
        var left = i+1
        var right = nums.size-1
        while (left<right){
            val sum = nums[i]+nums[left]+nums[right]
            if (sum == 0){
                ans.add(listOf( nums[i],nums[left],nums[right]))
                left++
                right--

                while (left<right && nums[left] == nums[left-1]) left++
                while (left<right && nums[right] == nums[right-1]) right--


            } else if(sum > 0){
                left++
            } else {
                right--
            }
        }
    }
    return ans
}

fun main() {
    val nums = intArrayOf(-1,0,1,2,-1,-4) //{-4,-1,-1,0,1,2}
    println("Three Sum 0 Number : ${threeSumTwoPointer(nums = nums).forEach { 
        println("${it.joinToString()}") }}")
}