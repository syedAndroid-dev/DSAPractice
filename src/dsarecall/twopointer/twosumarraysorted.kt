package dsarecall.twopointer


fun twoSumArraySorted(arr: IntArray,target: Int):IntArray{
    var start = 0
    var end = arr.size-1

    while (start<end){
        if (arr[start]+arr[end] > target){
            end--
        } else if(arr[start]+arr[end] < target){
            start++
        } else {
            return intArrayOf(start+1,end+1)
        }
    }
    return intArrayOf(0,0)
}

fun main() {
    val arr = intArrayOf(-1,0)
    val target = -1

    println("target founded in : ${twoSumArraySorted(arr = arr,target = target).joinToString()}")
}