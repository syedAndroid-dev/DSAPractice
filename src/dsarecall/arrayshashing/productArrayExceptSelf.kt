package dsarecall.arrayshashing

fun productArrayExceptSelf(arr:IntArray):IntArray{
    val result = IntArray(arr.size){ 1 }
    var prefix = 1
    var postFix = 1

    for (i in arr.indices){
        result[i] *= prefix
        prefix *= arr[i]
    }

    for (j in arr.size-1 downTo 0){
        result[j] *= postFix
        postFix *= arr[j]
    }
    return result
}
fun main() {
    println("product ArrayExcept Self : ${productArrayExceptSelf(arr = intArrayOf(1,2,3,4)).joinToString()}")
}