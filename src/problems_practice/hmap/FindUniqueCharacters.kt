package problems_practice.hmap

fun findUniqueChars(s:String):Int{
    val charCount = IntArray(26){ 0 }

    for (i in 0 until  s.length){
        charCount[s[i].code - 'a'.code] = charCount[s[i].code - 'a'.code]+1
    }

    for (j in charCount.indices){
        if (charCount[s[j].code - 'a'.code] == 1){
            return j
        }
    }

    return -1
}

fun firstUniqChar(s: String): Int {
    val frequencyHashMap = mutableMapOf<Char,Int>()
    for(i in 0 until s.length){
        frequencyHashMap[s[i]] = frequencyHashMap.getOrDefault(s[i],0)+1
    }

    var uniqueChar : Char = '\u0000'

    for((key,value) in frequencyHashMap){
        if(value == 1){
            uniqueChar = key
            break
        }
    }

    for(i in 0 until s.length){
        if(s[i] == uniqueChar){
            return i
        }
    }

    return -1
}
fun main() {
    val s = "loveleetcode"

    println("Unique Chars : ${findUniqueChars(s = s)}")
}