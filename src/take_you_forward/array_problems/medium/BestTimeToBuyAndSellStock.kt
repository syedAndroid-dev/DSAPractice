package take_you_forward.array_problems.medium

fun bestTimeToBuyAndSell(prices:IntArray):Int {

    var minElement = Int.MAX_VALUE
    var maxProfit = 0

    for (i in prices){
        if(i < minElement){
            minElement = i
        } else if(i - minElement > maxProfit){
            maxProfit = i - minElement
        }
    }

    return maxProfit
}


