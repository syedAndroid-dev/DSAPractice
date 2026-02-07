package revision

fun sort0s1s2s(input:IntArray){
    var zeroCount = 0
    var oneCount = 0
    var twoCount = 0
    var index = 0

    for (num in input){
        when (num) {
            0 -> {
                zeroCount +=1
            }
            1 -> {
                oneCount +=1
            }
            2 -> {
                twoCount +=1
            }
        }
    }

    for (i in 0..<zeroCount){
        input[index++] = 0
    }

    for (j in 0..<oneCount){
        input[index++] = 1
    }

    for (k in 0..<twoCount){
        input[index++] = 2
    }
}

fun sort0s1s2sOptimal(input:IntArray){
    var low = 0
    var mid = 0
    var high = input.size-1

    while (mid<=high){
        when(input[mid]){
            //Beginning
            0 -> {
                swap(array = input, i = low, j = mid)
                low++
                mid++
            }
            //Mid
            1 -> {
                mid++
            }
            //High
            2 -> {
                swap(array = input, i = mid, j = high)
                high--
            }
        }
    }
}

fun swap(array: IntArray,i:Int,j:Int){
    val temp = array[i]
    array[i] = array[j]
    array[j] = temp
}

fun main() {
    val arr = intArrayOf(1, 0, 2, 1, 0)
    println("Before Sort : ${arr.joinToString()}")
    sort0s1s2sOptimal(input = arr)
    println("After Sort : ${arr.joinToString()}")

}