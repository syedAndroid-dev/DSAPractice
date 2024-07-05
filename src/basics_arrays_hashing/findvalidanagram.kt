package basics_arrays_hashing

fun findValidAnagramRecall(word1:String,word2: String):Boolean{
    val anagramArr = IntArray(26){ 0 }

    for (i in word1.indices){
        anagramArr[word1[i]-'a'] += 1
    }

    for (j in word2.indices){
        anagramArr[word2[j] - 'a'] -= 1
    }

    for (k in anagramArr){
        if(k != 0){
            return false
        }
    }

    return true
}


fun findGroupOfValidAnagram(arr : List<String>) : List<List<String>>{
    val anagramMap : HashMap<String,MutableList<String>> = hashMapOf()
    for (i in arr){
        val wordChar = i.toCharArray()
        wordChar.sort()
        val anagramString = String(wordChar)
        if(!anagramMap.containsKey(anagramString)){
            anagramMap[anagramString] = arrayListOf()
        }
        anagramMap[anagramString]?.add(i)
    }
    return anagramMap.values.toList()
}

fun main() {

    val word1 = "rat"
    val word2 = "tar"
    val arrList = listOf("eat","tea","tan","ate","nat","bat")
   // println("is Valid Anagram word1 : ${word1}, word2 : $word2 : ${findValidAnagramRecall(word1 = word1, word2 = word2)}")
    println("is Valid Group Anagram : ${findGroupOfValidAnagram(arr = arrList)}")
}