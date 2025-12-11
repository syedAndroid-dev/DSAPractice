package take_you_forward.array_problems

import kotlin.math.max


fun unionOfArrays(arr1:IntArray,arr2:IntArray):IntArray{
    val resultHSet = hashSetOf<Int>()

    for (i in arr1){
        resultHSet.add(i)
    }

    for (j in arr2){
        resultHSet.add(j)
    }

    return resultHSet.toIntArray()
}

fun unionOfArray2(arr1:IntArray,arr2:IntArray):IntArray{
    val arr1Size = arr1.size
    val arr2Size = arr2.size
    var resultArrIndex = 0
    val resultArr = IntArray(arr1Size+arr2Size) { 0 }

    var i = 0
    var j = 0

    while (i<arr1Size && j<arr2Size){
        if (arr1[i] <= arr2[j]){
            if (resultArrIndex == 0 || resultArr[resultArrIndex-1] != arr1[i]){
                resultArr[resultArrIndex++] = arr1[i]
            }
            i++
        } else {
            if (resultArrIndex == 0 || resultArr[resultArrIndex-1] != arr2[j]){
                resultArr[resultArrIndex++] = arr2[j]
            }
            j++
        }
    }
    while (i<arr1Size){
        if (resultArrIndex == 0 || resultArr[resultArrIndex-1] != arr1[i]){
            resultArr[resultArrIndex++] = arr1[i]

        }
        i++
    }

    while (j<arr2Size){
        if (resultArrIndex == 0 || resultArr[resultArrIndex-1] != arr2[j]){
            resultArr[resultArrIndex++] = arr2[j]

        }
        j++
    }


    return resultArr
}

fun intersectionOfTwoArray(arr1:IntArray,arr2: IntArray):IntArray{
    var resultArrIndex = 0
    val resultArr = IntArray(arr1.size+arr2.size){ 0 }
    val visitedArr = IntArray(arr2.size){ 0 }

    //Time : Bigo(n+m)
    //Space : O(m)

    for (i in arr1.indices){
        for (j in arr2.indices){
            if (arr1[i] == arr2[j] && visitedArr[j] == 0){
                resultArr[resultArrIndex++] = arr2[j]
                visitedArr[j] = 1
                break
            }

            if (arr2[j]>arr1[i]){
                break
            }
        }
    }

    return resultArr
}

fun intersectionOfArrayTwoPointer(arr1: IntArray,arr2: IntArray):IntArray{

    val resultArr = IntArray(arr1.size+arr2.size){ 0 }
    var resultArrIndex = 0
    var i = 0
    var j = 0

    while (i<arr1.size && j<arr2.size){
        if (arr1[i] < arr2[j]){
            i++
        } else if(arr2[j] < arr1[i]){
            j++
        } else {
            resultArr[resultArrIndex++] = arr1[i]
            i++
            j++
        }
    }

    return resultArr
}

fun main() {
    val arr1 = intArrayOf(1,2,3,4,5)
    val arr2 = intArrayOf(2,3,4,4,5,7)

    println("Union of two sorted Array : ${intersectionOfArrayTwoPointer(arr1, arr2).joinToString()}")
}