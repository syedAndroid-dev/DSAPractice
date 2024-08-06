package slidingwindow

import java.util.Deque
import java.util.LinkedList

fun slidingWindowMaximum(arr : IntArray,k:Int):IntArray{

    var left = 0
    var right = 0
    val deque : Deque<Int> = LinkedList()
    val outPut = IntArray(arr.size - k+1){ 0 }

    while (right<arr.size){
        if(deque.isNotEmpty() && deque.peekFirst() < right-k+1)
            deque.pollFirst()

        while (deque.isNotEmpty() && arr[right] > arr[deque.peekLast()])
            deque.pollLast()

        deque.offer(right)

        if (right >= k - 1)
            outPut[left++] = arr[deque.peekFirst()]
        right++
    }
    return outPut
}

fun main() { 
    val result = slidingWindowMaximum(arr = intArrayOf(1,3,-1,-3,5,3,6,7), k = 3)
    for (i in result){
        print("$i ")
    }
}