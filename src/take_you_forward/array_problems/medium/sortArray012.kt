package take_you_forward.array_problems.medium

fun sortArray0And1And2(input:IntArray){
    for (i in 0..<input.size) {
        for (j in i..<input.size){
            if (input[j] < input[i]){
                val temp = input[i]
                input[i] = input[j]
                input[j] = temp
            }
        }
    }
}

fun main() {
    val input = intArrayOf(2,0,2,1,1,0)
    println("BeforeSorting : ${input.joinToString()}")
    sortArray0And1And2(input = input)
    println("AfterSorting : ${input.joinToString()}")
}


//fun majorityElement(arr: IntArray): Int {
//    var count = 0
//    var element = 0
//
//    for (i in 0 until arr.size){
//        if(count == 0){
//            element = arr[i]
//            count++
//        } else if(arr[i] == element){
//            count++
//        } else{
//            count--
//        }
//    }
//
//    var count1 = 0
//    for (i in 0 until arr.size){
//        if (element == arr[i]){
//            count1++
//        }
//    }
//
//    if (count1>arr.size/2){
//        return element
//    }
//    return -1
//}