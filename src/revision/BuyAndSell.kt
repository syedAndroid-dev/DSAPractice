package revision

import kotlin.math.min

fun bestTimeToBuyAndSell(input: IntArray) :Int{
    var maxProfit = Int.MIN_VALUE

    for (i in 0..<input.size){
        for (j in i+1..<input.size){
            maxProfit = Math.max(maxProfit,input[j]-input[i])
        }
    }
    return maxProfit
}

fun bestTimeToBuyAndSellOptimal(input: IntArray) :Int{
    var maxProfit = Int.MIN_VALUE
    var minBuy = Int.MAX_VALUE

    for (buy in input.indices){
        if (input[buy] < minBuy){
            minBuy = input[buy]
        } else {
            maxProfit = Math.max(maxProfit,input[buy]-input[minBuy])
        }
    }
    return maxProfit
}

fun main() {
    val arr = intArrayOf(7, 1, 5, 3, 6, 4)
    println("Best Time to buy and sell is : ${bestTimeToBuyAndSellOptimal(arr)}")
}