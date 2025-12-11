package problems_practice.dsapractice.topic_02_two_pointer


fun twoSumTwoPointer(num : IntArray,target : Int):IntArray{

    if(num.isEmpty()){
        return intArrayOf(0,0)
    }
    var start = 0
    var end = num.size-1

    while (start<=end){
        if (num[start]+num[end] > target){
            end--
        } else if(num[start]+num[end] < target){
            start++
        } else {
            return intArrayOf(num[start],num[end])
        }
    }
    return intArrayOf(0,0)
}

fun main() {
    val arr = intArrayOf(1,2,3,4)
    println("Result Arr : ${twoSumTwoPointer(num = arr, target = 3).joinToString()}")
}