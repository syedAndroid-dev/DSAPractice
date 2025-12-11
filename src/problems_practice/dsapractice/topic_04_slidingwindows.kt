package problems_practice.dsapractice

fun bastTimeToBuyAndSell(arr : IntArray):Int{
    var maxProfit = 0
    var left = 0
    var right = 1

    while (right < arr.size){
        if (arr[right]>arr[left]){
            val profit = arr[right]-arr[left]
            maxProfit = maxOf(maxProfit,profit)
        } else {
            left = right
        }
        right++
    }
    return maxProfit
}

fun longestSubstringWithOutRepeatingCharacters(str : String): Int{
    val resultSet = hashSetOf<Char>()
    var left = 0
    var result = 0

    for (right in str.indices){
        while (str[right] in resultSet){
            resultSet.remove(str[left])
            left++
        }

        resultSet.add(str[right])
        result = maxOf(result,right-left+1)
    }

    return result
}

fun main() {
    val arr = intArrayOf(7,1,5,3,6,4)
    //println("Buy And Sell : ${bastTimeToBuyAndSell(arr = arr)}")
    println("Longest Substring WIthout Repeating : ${longestSubstringWithOutRepeatingCharacters(str = "pwwkew")}")
}