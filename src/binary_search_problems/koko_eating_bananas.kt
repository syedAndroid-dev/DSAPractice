package binary_search_problems

import kotlin.math.ceil


fun kokoEatingBananas(arr:IntArray,hours:Int):Int{
    var i=1
    var j = arr.max()

    var result = j

    while (i<=j){
        val mid = i+j/2
        var hour = 0
        for (k in arr){
            hour += ceil((k/mid).toDouble()).toInt()
        }

        if(hour <= hours){
            result = result.coerceAtMost(mid)
            j = mid-1
        } else {
            i = mid+1
        }
    }
    return result
}


fun main() {
    val arr = intArrayOf(3,6,7,11)
    val hours = 8

    println("minimum banas we use to eat banas : ${kokoEatingBananas(arr, hours)}")
}