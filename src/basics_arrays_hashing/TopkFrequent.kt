package basics_arrays_hashing

import java.util.*

fun findFrequentElementInArray2(arr : List<Int>,k : Int): IntArray{
    val mp = HashMap<Int, Int>()
    val heap = PriorityQueue<Int> { n1, n2 -> mp[n1]!! - mp[n2]!! }
    val top = IntArray(k)
    val n = arr.size

    for (i in 0..<n) {
        mp[arr[i]] = mp.getOrDefault(arr[i], 0) + 1
    }

    for (entry in mp.keys) {
        heap.add(entry)
        if (heap.size > k)
            heap.poll()
    }

    for (i in k - 1 downTo 0) {
        top[i] = heap.poll()
    }
    return top
}

fun main(){
    val arr = listOf(3, 1, 4, 4, 5, 2, 6, 1,5,5,5)
    println(findFrequentElementInArray2(arr = arr,k = 2))
}