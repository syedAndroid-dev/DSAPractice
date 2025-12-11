package problems_practice.dsapractice.topic_01_arrays_hashing

fun bestTimeToBuyAndSellMaxProfit(arr: IntArray): Int{
    var minElement = Int.MAX_VALUE
    var maxProfit = 0

    for (i in arr){
        if(i < minElement){
            minElement = i
        } else if(i - minElement > maxProfit){
            maxProfit = i - minElement
        }
    }

    return maxProfit
}

fun bestTimeToBuyAndSellStockMaxProfit(arr: IntArray):Int{
    var minElement = 0
    var profit = 0
    var maxProfit = 0
    var currentElement = 0

    while (currentElement < arr.size){
        if(arr[minElement] < arr[currentElement] ){
            minElement = arr[currentElement]
        } else if(arr[currentElement] - arr[minElement] > profit){
            profit = arr[currentElement] - arr[minElement]
        } else {
            maxProfit += profit
            minElement = currentElement+1
            currentElement++
        }
        currentElement++
    }

    return maxProfit
}

fun canJump(nums: IntArray): Boolean {
    var element = 0
    while(element < nums.size){
        if(nums[element] >= nums.size - element){
            return true
        } else  {
            element = nums[element]-1
        }
    }

    return false
}


fun main() {
    var arr = intArrayOf(2,3,1,1,4)

    println("Max Profit : ${canJump(nums = arr)}")
}