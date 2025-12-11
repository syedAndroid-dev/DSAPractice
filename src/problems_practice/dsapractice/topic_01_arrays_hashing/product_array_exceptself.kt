package problems_practice.dsapractice.topic_01_arrays_hashing


fun productArrayExceptSelf(arr: IntArray): IntArray {

    val preFixArr = IntArray(arr.size){ 1 }
    val postFixArr = IntArray(arr.size){ 1 }
    val resultArr = IntArray(arr.size){ 1 }

    //prefix arr
    for (i in 1..<arr.size){
        preFixArr[i] = arr[i-1] * preFixArr[i-1]
    }

    //PostFix arr
    for (j in (arr.size-2).downTo(0)){
        println(j)
        postFixArr[j] = arr[j+1]*postFixArr[j+1]
    }

    //result arr
    for (k in arr.indices){
        resultArr[k] = preFixArr[k]*postFixArr[k]
    }

    return resultArr
}

fun productArrayExceptSelfOptimized(arr:IntArray):IntArray{

    val resultArr = IntArray(arr.size){ 1 }

    var prefixSum = 1
    for (i in 1..<arr.size){
        resultArr[i] = prefixSum
        prefixSum *= arr[i]
    }

    var postFix = 1
    for (i in (arr.size-1).downTo(0)){
        resultArr[i] *= postFix
        postFix *= arr[i]
    }

    return resultArr
}

fun main() {
    val arr = intArrayOf(-1,1,0,-3,3)

    println("Result Array : ${productArrayExceptSelfOptimized(arr = arr).joinToString()}")
}