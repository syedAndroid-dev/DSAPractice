package problems_practice.dsapractice.topic_01_arrays_hashing

fun arrayElementsDuplicateOrNotBrtApproach(arr : IntArray) : Boolean {
    for (i in arr.indices){
        for (j in arr.indices){
            if(arr[i] == arr[j]){
                return true
            }
        }
    }

    return false
}

fun arrayContainsDuplicatesInHashmap(arr : IntArray) : Boolean {
    val hMap = mutableMapOf<Int,Int>()

    for (i in arr){
        hMap[i] = hMap.getOrDefault(i,0)+1
    }
    for (i in hMap){
        if(i.value > 1){
            return true
        }
    }
    return false
}


fun main() {
    val arr = intArrayOf(1, 2, 3, 4)

    println("Given Array Duplicate Or Not : ${arrayContainsDuplicatesInHashmap(arr = arr)}")
}