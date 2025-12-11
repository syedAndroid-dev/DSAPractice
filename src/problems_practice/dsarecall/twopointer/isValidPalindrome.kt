package problems_practice.dsarecall.twopointer

fun isPalindrome(s: String): Boolean {
    if(s.isBlank()){
        return true
    }
    if (s.length == 2){
        return s[0] == s[1]
    }
    var start = 0
    var end = s.length-1

    while(start < end){
        val startChar = s.get(start)
        val endChar = s.get(end)

        if((startChar in 'a'..'z' || startChar in 'A'..'Z') && (endChar in 'a'..'z' || endChar in 'A'..'Z')){
            //&& startChar.toInt() !in 0..9
            if(startChar.lowercaseChar() != endChar.lowercaseChar()){
                return false
            }
            start+=1
            end-=1
        } else if(startChar.isDigit() && endChar.isDigit()){
            //&& endChar.toInt() !in 0..9)
            if(startChar != endChar){
                return false
            }
            start+=1
            end-=1
        } else if((startChar !in 'a'..'z' && startChar !in 'A'..'Z') && !startChar.isDigit()){
            start+=1
        } else if((endChar !in 'a'..'z' && endChar !in 'A'..'Z') && !endChar.isDigit()){
            end-=1
        } else {
            return false
        }
    }
    return true
}

fun isPalindrome1(s : String) : Boolean{
    if(s.isBlank()){
        return true
    }
    var start = 0
    var end = s.length-1

    while(start <= end){
        if((s[start] !in 'a' .. 'z') && (s[start] !in 'A'..'Z') && (s[start] !in '0'..'9')){
            start++
        } else if((s[end] !in 'a' .. 'z') && (s[end] !in 'A'..'Z') && (s[end] !in '0'..'9')){
            end--
        } else {
            if(s[start].lowercaseChar() != s[end].lowercaseChar()){
                return false
            }
            start++
            end--
        }
    }
    return true
}
fun main() {
  println("${isPalindrome1(s = "A man, a plan, a canal: Panama")}")

}