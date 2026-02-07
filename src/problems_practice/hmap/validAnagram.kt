package problems_practice.hmap

fun isAnagram(s: String, t: String): Boolean {
    val frequencyArray = IntArray(26){ 0 }

    if(s.length != t.length){
        return false
    }

    for(i in 0 until s.length){
        frequencyArray[s[i].code - 'a'.code] = frequencyArray[s[i].code-'a'.code]+1
    }

    for(j in 0 until t.length){
        frequencyArray[t[j].code - 'a'.code] = frequencyArray[t[j].code-'a'.code]-1
    }

    for(k in frequencyArray){
        if(k >= 1){
            return false
        }
    }
    return true
}

fun main() {
    val s1 = "anagram"
    val s2 = "nagaram"

    println("is valid Anagram : ${isAnagram(s = s1, t = s2)}")
}