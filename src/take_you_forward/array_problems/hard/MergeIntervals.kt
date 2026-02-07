package take_you_forward.array_problems.hard

fun mergeIntervals(arr:Array<IntArray>):Array<IntArray>{
    arr.sortBy { it.first() }

    val arrSize = arr.size

    var result = mutableListOf<IntArray>()

    var i = 0

    while (i<arrSize){
        var start = arr[i][0]
        var end = arr[i][1]

        var j = i+1

        while (j < arrSize && arr[j][0] < end){
            end = end.coerceAtLeast(arr[j][1])
            j++
        }
        result.add(intArrayOf(start,end))

        i=j
    }

    return result.toTypedArray()
}


fun mergeIntervalsOptimized(arr:Array<IntArray>):Array<IntArray>{
    arr.sortBy { it.first() }
    val arrSize = arr.size
    var result = mutableListOf<IntArray>()

    for (i in 0 until arrSize){
        if (result.isEmpty() || result.last()[1] > arr[i][0]){
            result.add(intArrayOf(arr[i][0],arr[i][1]))
        } else {
            val last = result.size-1

            val maxEnd = Math.max(result.get(last)[1],arr[i][1])

            result.get(last)[1] = maxEnd
        }
    }

    return result.toTypedArray()
}

fun main() {
    val arr = arrayOf<IntArray>(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18))

    var result: MutableList<IntArray> = mutableListOf()

    var i = 0

    var n = arr.size

    while (i < n) {
        var startInterval = arr[i][0]
        var endInterval = arr[i][1]

        for (j in i+1 until arr.size){
            println("Arr Check 11 : ${arr.size}")
            if (startInterval <= arr[i][1] && arr[j][1] > endInterval){
                result.add(intArrayOf(arr[i][0],arr[j][1]))
                i = j
                break
            }
        }
        i++
    }

    println("Arr Check : ${result.joinToString { it.joinToString() }}")
}