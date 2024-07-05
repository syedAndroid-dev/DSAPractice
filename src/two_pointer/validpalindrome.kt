package two_pointer

fun isValidPalindrome(s:String) : Boolean{
    var convertedString = ""

    if(s.isBlank()){
        return true
    }

    if (s.length == 2){
        return s[0] == s[1]
    }
    for (i in 0..<s.length){
        if(s[i]-'a' in 0..25){
            convertedString += s[i]
        } else if(s[i]-'A' in 0..25){
            convertedString += s[i]+32
        }
    }
    println("normal String : $s ,converted String :${convertedString}")
    var j = convertedString.length-1
    println("String length : ${convertedString.length} , ${convertedString.length/2}")
    for (i in 0..<convertedString.length/2){
        println("conveted ${convertedString[i]}  ${convertedString[j]}")
        if (convertedString[i] == convertedString[j]){
            j--
        } else {
            return false
        }
    }
    return true
}


fun isValidPalindromeMethod2(word:String):Boolean{

    var start = 0
    var end = word.length-1

    if(word.isEmpty()){
        return true
    }

    while (start<=end){
        if(!Character.isLetterOrDigit(word[start])){
            start++
        } else if(!Character.isLetterOrDigit(word[end])){
            end--
        } else {
            if(Character.toLowerCase(word[start]) != Character.toLowerCase(word[end])){
                return false
            }
            start++
            end--
        }
    }
    return true
}

fun main() {
    val s = "amm"
    println("is Valid palindrome : ${isValidPalindromeMethod2(s)}")
}