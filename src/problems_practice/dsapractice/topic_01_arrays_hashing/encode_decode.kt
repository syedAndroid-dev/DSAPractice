package problems_practice.dsapractice.topic_01_arrays_hashing

fun encodeString(strArr : List<String>):String{
    val strBuilder = StringBuilder()


    for (c in strArr){
        println(c.length)
        strBuilder.append("${c.length}#${c}")
    }
    return strBuilder.toString()
}

fun decodeString(str1 : String):List<String>{
    var i = 0
    val resultList = mutableListOf<String>()

    while (i < str1.length){
        var j = i
        while (str1[j] != '#'){
            j++
        }

        val charLength = str1.substring(i,j).toInt()

        i = j+1
        resultList.add(str1.substring(i,i+charLength))
        i += charLength
    }

    return resultList
}

fun main() {
    val str1 = listOf("neet","code","love","you")

    val encodedString = encodeString(strArr = str1)

    println("Encoded String : $encodedString")

    val decodedString = decodeString(str1 = encodedString)

    println("Decoded String : $decodedString")
}