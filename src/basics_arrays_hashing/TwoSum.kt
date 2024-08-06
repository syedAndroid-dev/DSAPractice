package basics_arrays_hashing


//Arrays & hashing Recall
fun findTwoSum(arr:IntArray,target: Int):IntArray{
    val hMap : MutableMap<Int,Int> = mutableMapOf()

    for (i in arr.indices){
        val num = arr[i]
        val difference = target-num
        if (hMap.containsKey(difference)){
            return intArrayOf(hMap.getOrDefault(difference,0),i)
        }
        hMap[num] = i
    }

    return intArrayOf()
}

fun groupAnagram(arr:List<String>):List<MutableList<String>>{
    val hMap : MutableMap<String,MutableList<String>> = mutableMapOf()

    for (i in arr){
        val anagramArr = i.toCharArray()
        anagramArr.sort()
        val anagramStr = String(anagramArr)
        if (!hMap.containsKey(anagramStr)){
            hMap[anagramStr] = mutableListOf()
        }
        hMap[anagramStr]?.add(i)
    }

    return hMap.values.toList()
}

fun topKFrequentElement(arr: IntArray,element:Int):List<Int>{
    val topKHMap = mutableMapOf<Int,Int>()
    for (i in arr.indices){
        topKHMap[arr[i]] = topKHMap.getOrDefault(arr[i],0) + 1
    }
    return topKHMap.values.sortedByDescending { it }.subList(0,element-1)
}


fun main() {
//    println("findTwoSum : ${findTwoSum(arr = intArrayOf(2,7,11,15),target=9)}")
//    for (i in findTwoSum(arr = intArrayOf(2,7,11,15),9)){
//        print("${i} ")
//    }

 //   println("findValid Anagram : ${groupAnagram(arr = listOf("eat","tea","tan","ate","nat","bat"))}")

    //TopKFrequent Element
    println("Top k Frequent Element : ${topKFrequentElement(arr = intArrayOf(1,1,1,2,2,3), element = 2)}")
}