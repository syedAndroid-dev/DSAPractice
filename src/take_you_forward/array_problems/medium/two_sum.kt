package take_you_forward.array_problems.medium

fun findTwoSumTarget(array: IntArray,target:Int):IntArray{
    for (i in 0..<array.size){
        for (j in 0..<array.size){
            if (i != j && array[i] + array[j] == target){
                return intArrayOf(i,j)
            }
        }
    }
    return intArrayOf(-1,-1)
}

fun findTwoSumTargetHMap(array: IntArray,target:Int):IntArray{
    val sumHashMap = hashMapOf<Int,Int>() // key - targetRemaining and value - Index

    for (i in 0..<array.size){
        val remaining = target - array[i]

        if (sumHashMap.containsKey(array[i])){
            return intArrayOf(i,sumHashMap.getOrDefault(array[i],0))
        }
        sumHashMap[remaining] = i
    }

    return intArrayOf(-1,-1)
}

fun main() {
    val arr = intArrayOf(3,2,4)
    val target = 6
    println("Two Sum : ${findTwoSumTargetHMap(array = arr, target = target).joinToString()}")
}