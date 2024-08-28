package dsarecall.arrayshashing

import java.util.*
import kotlin.collections.ArrayList

fun findTopKFrequentElements(arr:IntArray,k:Int):IntArray{
    val hMap = hashMapOf<Int,Int>()
    val ansArray = IntArray(k)
    val queue = PriorityQueue<Int>{ n1,n2 -> hMap[n1]!! - hMap[n2]!! }

    for (i in arr.indices){
        hMap[arr[i]] = hMap.getOrDefault(arr[i],0) + 1
    }

    for (entry in hMap.keys) {
        queue.add(element = entry)
        if (queue.size > k)
            queue.poll()
    }

    for (i in k-1 downTo 0){
        ansArray[i] = queue.poll()
    }
    return ansArray
}

fun findTopKFrequentElements2(arr:IntArray,k:Int):IntArray{
    val hMap = hashMapOf<Int,Int>()
    val frequencyHashMap = hashMapOf<Int,ArrayList<Int>>()
    val resultArr = IntArray(k)
    var index = 0
    val possibleCount = arr.size

    for (i in arr.indices){
        hMap[arr[i]] = hMap.getOrDefault(arr[i],0)+1
    }

    for (j in hMap.keys){
        val count = hMap[j]!!
        if (!frequencyHashMap.containsKey(count)) frequencyHashMap[count] = arrayListOf()
        frequencyHashMap[count]?.add(j)
    }

    for (i in possibleCount downTo 1){
        if (frequencyHashMap.containsKey(i)){
            for (n in frequencyHashMap[i]!!){
                if (index < k){
                    resultArr[index++] = n
                } else {
                    break
                }
            }
        }

        if (index >= k){
            break
        }
    }

    return resultArr
}

fun main() {
    val arr = intArrayOf(1,1,1,2,2,3)
    val k = 2

    println("Top K Frequent Elements : ${findTopKFrequentElements2(arr = arr,k = k).joinToString()}")
}