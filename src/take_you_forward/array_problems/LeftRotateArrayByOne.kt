package take_you_forward.array_problems

fun rotateArrayByOne(arr:IntArray){
    var firstValue = 0
    for (i in 1..<arr.size){
        val temp = arr[firstValue]
        arr[firstValue] = arr[i]
        arr[i] = temp

        firstValue++
    }
}

fun leftRotateArrayByNTimes(arr: IntArray,n:Int){
    for (i in 0..<n){
        var firstValue = 0
        for (j in 1..<arr.size){
            val temp = arr[firstValue]
            arr[firstValue++] = arr[j]
            arr[j] = temp
        }
    }
}

fun rotateTheArrayByKSteps(nums:IntArray,k:Int){
    val temp = IntArray(nums.size){ 0 }

    for (i in 0..<k){
        temp[i+k] = nums[i]
    }

    for (j in k..<nums.size){
        temp[k-j] = nums[j]
    }

    println("Temp Check : ${temp}")
}

fun main() {
    val arr = intArrayOf(1,2,3,4,5)
    println("Before Rotating : ${arr.joinToString()}")
    rotateTheArrayByKSteps(arr,3)
    println("After Rotating : ${arr.joinToString()}")
}