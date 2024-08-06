package slidingwindow


fun minimumWindowSubString(s1: String,s2: String):String{
    val frequencyS1Map = mutableMapOf<Char,Int>()
    val frequencyS2Map = mutableMapOf<Char,Int>()
    var left = 0
    var right = 0
    var st = 0
    var uniqueSize = s2.length
    var uniqueTillNow = 0
    var size = Int.MAX_VALUE

    // s1 = "ADOBECODEBANC", s2 = "ABC"

    //Adding all the possible values to the frequency s2 list
    for (i in s2){
        frequencyS2Map[i] = frequencyS2Map.getOrDefault(i,0) + 1
    }

    while (right < s1.length){
        frequencyS1Map[s1[right]] = frequencyS1Map.getOrDefault(s1[right],0) + 1
        if (frequencyS2Map[s1[right]] == frequencyS1Map[s1[right]])
            uniqueTillNow++

        while (left<=right && uniqueTillNow == uniqueSize){
            if (right-left+1 < size){
                st = left
                size = right-left+1
            }
            frequencyS1Map[s1[left]] = frequencyS1Map.getOrDefault(s1[left],0) - 1
            if(frequencyS1Map.getOrDefault(s1[left],0) < frequencyS2Map.getOrDefault(s1[left],0)){
                uniqueTillNow--
            }
            left++
        }
        right++
    }

    return s1.substring(startIndex = st, endIndex = right)
}

fun main() {
    println("Minimum Window SubString : ${minimumWindowSubString(s1 = "ADOBECODEBANC", s2 = "ABC")}")
}