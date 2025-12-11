package problems_practice.dsapractice.topic_01_arrays_hashing

fun findConsecutiveLength(arr : IntArray):Int{

    val numSet = arr.toHashSet()
    var longest = 0

    for (i in numSet){
        if (i-1 !in numSet){
            var length = 1
            while ((i+length) in numSet){
                length++
            }
            longest = maxOf(length,longest)
        }
    }

    return longest
}

fun main() {

    val arr = intArrayOf(100,4,200,1,3,2)

    println("Longest Consequtive Sequence : ${findConsecutiveLength(arr = arr)}")
}