package basics_arrays_hashing

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap


fun findFrequentElement(arr : List<Int>,k : Int):List<Int>{
    val frequencyMap : HashMap<Int,Int> = hashMapOf()
    val priorityFrequency = PriorityQueue<Map.Entry<Int,Int>>{ a,b->
        if(a.value == b.value){
            b.key.compareTo(a.key)
        } else {
            b.value.compareTo(a.value)
        }
    }

    for (i in 0..<arr.size){
        frequencyMap[arr[i]] = frequencyMap.getOrDefault(arr[i],0)+1
    }

    for (entry in frequencyMap.entries){
        priorityFrequency.offer(entry)
    }

    val result = priorityFrequency.map { it.key }
    return result.take(k);
}


fun findFrequentElementInArray(arr : List<Int>,k : Int): List<Int>{
    val mp = HashMap<Int, Int>()
    val n = arr.size
    for (i in 0..<n) {
        mp[arr[i]] = mp.getOrDefault(arr[i], 0) + 1
    }

    val queue = PriorityQueue<Map.Entry<Int, Int>> { a, b ->
        if (a.value == b.value) {
            b.key.compareTo(a.key)
        } else {
            b.value.compareTo(a.value)
        }
    }

    // Insert the data from the map to the Priority Queue.
    for (entry in mp.entries) {
        queue.offer(entry)
    }

    val m = queue.map { it.key }
    return m.take(k)
}

fun findFrequentElementBucketSort(arr: List<Int>, k: Int): java.util.ArrayList<Int>{
    val mp =  HashMap<Int,Int>()
    val frequency : Array<ArrayList<Int>> = Array(size = arr.size+1){ arrayListOf() }
    val result : ArrayList<Int> = arrayListOf()

    for(i in arr){
        mp[i] = mp.getOrDefault(mp[i],0)+1
    }

    for((key,value) in mp){
        frequency[value].add(key)
    }

    for(i in frequency.size-1 downTo 0){
        for (j in frequency[i]){
            result.add(j)
            if (result.size == k)
                return result
        }
    }

    return result
}

fun main(){
    val arr = listOf(3, 1, 4, 4, 5, 2, 6, 1,5,5,5)
    println(findFrequentElement(arr = arr,k = 2))
}