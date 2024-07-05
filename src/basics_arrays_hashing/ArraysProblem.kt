package basics_arrays_hashing

import java.util.PriorityQueue


fun problem1Array():Boolean{
    val nums = intArrayOf(1,2,3,4,1)
    nums.sort()

    for (i in 1..nums.size){
        if (nums[i] == nums[i-1]){
            return true
        }
    }
    return false
}

fun hashMapExample(){
    val hMap : HashMap<Char,Int> = hashMapOf()
    hMap['S'] = 1
    hMap['A'] = 5
    hMap['D'] = 10
    println(hMap)
    if(hMap.contains('A')){
        hMap['A']
    }
    println("is A contains inside : ${hMap.contains('A')}, keys : ${hMap.values}")
}

fun findValidAnagram(s:String,t:String):Boolean{
    val numArr = IntArray(26)
    for (i in s.indices){
        println("printing i is ${i}, ${s[i]} ${s[i]-'a'}")
        numArr[s[i]-'a'] += 1
    }

    for (j in t.indices){
        println("printing j is ${j}, ${t[j]} ${t[j]-'a'}")
        numArr[t[j]-'a'] -= 1
    }

    for (i in numArr){
        println("num $i")
        if(i != 0){
            return false
        }
    }
    return true
}

fun findFrequentElement(numbers : IntArray,frequentElement : Int):IntArray{
    val frequentMap : HashMap<Int,Int> = hashMapOf()
    val result = IntArray(frequentElement)
    for(i in numbers){
        if(!frequentMap.containsKey(i)){
            frequentMap[i] = 0
        }
        frequentMap[i] = frequentMap.getOrDefault(i,0) + 1
    }

    println("sortedelement $frequentMap")

    for (j in frequentMap){
        if(j.value >= frequentElement){
            println("${frequentMap[j.key]}")
           // println(frequentMap[j.value])
           // result[j.key-1] = frequentMap[j.value]!!
        }
    }
    println("sortedMap : $result")
    return result
}

fun main() {
   // println(problem1Array())
   //hashMapExample()
    // val s = "rat"
    //val t = "car"
    //println("checking Anagram : s : ${s} and t : ${t} = ${findValidAnagram(s = s,t=t)}")
//    val anagramLetters = arrayListOf("eat","tea","tan","ate","nat","bat")
//    val duplicateAnagram : HashMap<String,ArrayList<String>> = hashMapOf()
//
//    for (i in anagramLetters){
//        val anagramChar = i.toCharArray()
//        anagramChar.sort()
//        val sortedWord = String(anagramChar)
//        if(!duplicateAnagram.containsKey(sortedWord)){
//            duplicateAnagram[sortedWord] = arrayListOf()
//        }
//
//        duplicateAnagram[sortedWord]?.add(i)
//    }
//    println(duplicateAnagram.values)

//    val frequentElements = intArrayOf(-1,-1)
//
//    println(findFrequentElement(numbers = frequentElements, frequentElement = 1))

//    val priorityQueue = PriorityQueue<Int>()
//    priorityQueue.add(800)
//    priorityQueue.add(700)
//    priorityQueue.add(600)
//    priorityQueue.add(500)
//
//    println("first element ${priorityQueue.peek()}")
//    for(i in priorityQueue){
//        println(i)
//    }
    val arr = mutableMapOf(5 to 7,7 to 2, 10 to 5)
    val priorityMapQueue = PriorityQueue<Map.Entry<Int,Int>> { a, b ->
        when {
            a.value == b.value -> b.key.compareTo(a.key)
            else -> b.value.compareTo(a.value)
        }
    }

    for(i in arr){
        priorityMapQueue.offer(i)
    }

    for(i in priorityMapQueue){
        println(i)
    }
}

