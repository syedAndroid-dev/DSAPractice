package linkedlist


fun findDuplicateOfAnArray(arr : IntArray):Int{
    var slow = arr[0]
    var slow2 = arr[0]
    var fast = arr[0]

    do {
        slow = arr[slow]
        fast = arr[arr[fast]]
    } while (slow != fast)

    fast = slow
    while (slow2 != fast){
        slow2 = arr[slow2]
        fast = arr[fast]
    }

    return slow2
}

fun main() {
    val arr = intArrayOf(1, 4, 3, 4, 2)
    println("Duplicate Of An Number : ${findDuplicateOfAnArray(arr = arr)}")
}