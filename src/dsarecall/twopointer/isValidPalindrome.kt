package dsarecall.twopointer

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
            if(startChar.toLowerCase() != endChar.toLowerCase()){
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

fun main() {
  println("${isPalindrome(s = "a.")}")

}