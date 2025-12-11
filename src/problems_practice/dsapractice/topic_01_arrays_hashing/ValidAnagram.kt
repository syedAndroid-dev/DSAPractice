package problems_practice.dsapractice.topic_01_arrays_hashing

fun validAnagram(s:String,t:String):Boolean{
    val arr = IntArray(26) { 0 }

    for (i in s.indices){
        arr[s[i]-'a'] += 1
        arr[t[i]-'a'] -= 1
    }

    for (i in arr){
        if (i != 0){
            return false
        }
    }

    return true
}

fun main() {
    val s = "racecaz"
    val t = "carracz"

    println("isValid Anagram : ${validAnagram(s, t)}")
}