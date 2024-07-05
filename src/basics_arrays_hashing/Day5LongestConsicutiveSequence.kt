package basics_arrays_hashing

fun findLongestConsecutiveSequence(arr : IntArray):Int{
    val hSet = hashSetOf<Int>()
    arr.forEach { element->
        hSet.add(element)
    }
    var max = 0
    for (i in 0..<hSet.size){

        var num = arr[i]
        if(hSet.contains(num-1))
            continue

        var currentLength = 0
        while (hSet.contains(num)){
            currentLength++
            num++
        }
        max = max.coerceAtLeast(currentLength)
    }
    return max
}


fun main() {

    val arr = intArrayOf(100,4,200,1,3,2)
    println("Consecutive Sequence Numbers : ${findLongestConsecutiveSequence(arr = arr)}")
}