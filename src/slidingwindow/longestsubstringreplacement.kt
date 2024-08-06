package slidingwindow


fun longestSubStringSequence(str: String,replacementCount: Int):Int {
    val strMap : MutableMap<Char,Int> = mutableMapOf()
    var start = 0
    var result = 0

    for (end in str.indices){
        strMap[str[end]] = 1 + strMap.getOrDefault(str[end],0)

        if((end - start+1) - strMap.values.max() > replacementCount){
            strMap[str[start]] = strMap[str[start]]!! - 1
            start +=1
        }
        result = Math.max(result,end-start+1)
    }

    return result
}

fun main() {
    val str = "XYYX"
    val replacementCount = 2

    println("LongestSubtring replacement : ${longestSubStringSequence(str, replacementCount)}")
}