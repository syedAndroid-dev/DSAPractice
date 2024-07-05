package two_pointer

fun twoSum(arr : List<Int>,target: Int):List<Int>{
    var start = 0
    var end = arr.size-1
    while (start<=end){
        if(arr[start] + arr[end] == target){
            return listOf(start+1,end+1)
        } else if(arr[start] + arr[end] < target){
            start++
        } else {
            end--
        }
    }
    return listOf(-1,-1)
}

fun main() {
    val numbers = listOf(-1,0)
    val target = -1
    println("two sum of target : $target is ${twoSum(arr = numbers, target = target)}")
}