package take_you_forward.array_problems

fun checkArrayIsSorted(input:IntArray):Boolean{
    var rotatedIndex = 0
    for (i in 0..<input.size-1){
        if (input[i] > input[i+1]){
            rotatedIndex = i+1
        }
    }
    return checkArraySorted(arr = input, start = 0, end = rotatedIndex) && checkArraySorted(arr = input, start = rotatedIndex, end = input.size)
}

fun checkArraySorted(arr: IntArray,start:Int,end:Int):Boolean{
    var isSorted = true

    for (i in start..<end-1){
        if (arr[i] > arr[i+1]){
            isSorted = false
        }
    }

    return isSorted
}

fun main() {
    val arr = intArrayOf(1,2,3,4) //(1,2,3,4,5) --> Rotated (3,4,5,1,2)

    println("Given Array is : ${checkArrayIsSortedDuplicate(input = arr, start = 1, end = arr.size)}")
}

fun checkArrayIsSortedDuplicate(input:IntArray,start: Int,end: Int):Boolean{
    for (i in start..<end){
        if (input[i-1]>input[i]){
            return false
        }
    }
    return true
}