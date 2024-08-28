package dsarecall.arrayshashing


fun findValidAnagram(str1:String,str2:String):Boolean{
//    val str1CharArr = str1.toCharArray()
//    str1CharArr.sort()
//    val str2CharArr = str2.toCharArray()
//    str2CharArr.sort()
//
//    val str1String = String(str1CharArr)
//    val str2String = String(str2CharArr)
//    return str1String == str2String
    val hMap = hashMapOf<Char,Int>()

    if(str1.length != str2.length){
        return false
    }
    for (i in str1.indices){
        hMap[str1[i]] = hMap.getOrDefault(str1[i],0) + 1
        hMap[str2[i]] = hMap.getOrDefault(str2[i],0) -1
    }
    return !hMap.any { it.value >= 1 }
}
fun main() {
    val str1 = "anagram"
    val str2 = "nagaram"

    println("given two String Is Valid or not : ${findValidAnagram(str1,str2)}")
}