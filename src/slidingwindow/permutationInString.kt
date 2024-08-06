package slidingwindow

fun findPermutationOfString(s1: String,s2: String):Boolean{
    val needHmap : MutableMap<Char,Int> = mutableMapOf()
    val haveHmap : MutableMap<Char,Int> = mutableMapOf()
    var start = 0
    var end = 0

    if(s1.length > s2.length){
        return false
    }

    for(i in s1.indices){
        needHmap[s1[i]] = 1 + needHmap.getOrDefault(s1[i],0)
    }

    while(end < s2.length){
        val ch = s2[end]
        if(!needHmap.containsKey(ch)){
            end +=1
            start = end
            haveHmap.clear()
            continue
        }
        haveHmap[ch] = 1+haveHmap.getOrDefault(ch,0)
        while(haveHmap[ch]!! > needHmap[ch]!!){
            val strChar = s2[start]
            haveHmap[strChar] = haveHmap.getOrDefault(strChar,0)-1
            start+=1
        }
        val windowSize = end-start+1
        if(windowSize == s1.length){
            return true
        }
        end+=1
    }

    return false
}

fun main() {
    println("GivenString Permutation is : ${findPermutationOfString(s1 = "hello", s2 = "ooolleoooleh")}")
}