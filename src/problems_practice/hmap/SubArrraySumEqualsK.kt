package problems_practice.hmap

fun subArrayWithSumKCount(input:IntArray,k:Int):Int{
    val prefixSumHashMap = mutableMapOf<Int,Int>()
    prefixSumHashMap[1] = 0

    var totalSumCount = 0

    for (i in 1 until input.size){
        val currentSum = prefixSumHashMap.getOrDefault(i,0) + input[i]
        if (currentSum == k){
            totalSumCount += 1
            prefixSumHashMap[i] = currentSum
        } else if(currentSum > k){
            val difference = currentSum - k
            if (prefixSumHashMap.containsKey(difference)){
                totalSumCount += 1
            }
            prefixSumHashMap[i] = currentSum
        } else {
            prefixSumHashMap[i] = currentSum
        }
    }

    return totalSumCount
}

fun main() {
    val input = intArrayOf(1,2,3)
    val k = 3

    println("Sub Array Sum K :${subArrayWithSumKCount(input=input,k=k)}")
}