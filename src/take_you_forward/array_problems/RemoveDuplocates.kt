package take_you_forward.array_problems

fun removeDuplicatesFromSortedArray(arr:IntArray):Int{
    val hSet = mutableSetOf<Int>()
    var index = 0

    for (i in arr){
        if (!hSet.contains(i)){
            hSet.add(i)
            arr[index] = i
            index++
        }
    }

    return hSet.size
}


fun removeDuplicateInPlace(arr: IntArray){
    var uniqueElementPlace = 0
    for (i in 1..<arr.size){
        if (arr[i] != arr[uniqueElementPlace]){
            uniqueElementPlace++
            arr[uniqueElementPlace] = arr[i]

        }
    }
}


fun main() {
    val arr = intArrayOf(0,0,1,1,1,2,2,3,3,4)

    println("Before Removing Duplicates : ${arr.joinToString()}")
    removeDuplicateInPlace(arr)
    println("Before Removing Duplicates : ${arr.joinToString()}")

//    println("Before Removing Duplicates : ${arr.joinToString()}")
//    removeDuplicatesFromSortedArray(arr = arr)
//    println("After Removing Duplicates : ${arr.joinToString()}")
}