package problems_practice.dsapractice.topic_01_arrays_hashing

fun twoSum(arr : IntArray,target : Int):IntArray{
    val differenceMap : HashMap<Int,Int> = hashMapOf()

    for(i in arr.indices){
        differenceMap[arr[i]] = i
    }

    for(i in arr.indices){
        if(differenceMap.containsKey(target-arr[i]) && differenceMap[target-arr[i]] != i){
            return intArrayOf(i,differenceMap[target-arr[i]] ?: 0)
        }
    }
    return intArrayOf(0,0)

}

fun groupAnagram(arr : List<String>):List<List<String>>{
    val hMap : MutableMap<String,MutableList<String>> = mutableMapOf()

    for(i in arr){
        val sortedString = i.toCharArray().apply{ sort() }.joinToString("")
        println(sortedString)
        if(hMap.containsKey(sortedString)){
            hMap[sortedString]?.add(i)
        } else {
            hMap[sortedString] = mutableListOf(i)
        }

    }

    val m = hMap.values.map{ it.toList() }
    print(m)
    return m
}

fun main() {
    val arr = intArrayOf(3,4,5,6)
    val target = 7
    val anagram = listOf("act","pots","tops","cat","stop","hat")
    //print("Two Sum Elements : ${twoSum(arr = arr,target = target).joinToString()}")
    print("Group Anagram : ${groupAnagram(arr = anagram)}")
}