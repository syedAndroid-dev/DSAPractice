package problems_practice
//Arrays&hashing problem1
fun containsDuplicate(arr : IntArray):Boolean{
    for (i in arr.indices){
        for (j in arr.indices){
            if (i == j){
                continue
            }
            if (arr[i] == arr[j])
                return true
        }
    }
    return false
}

fun containsDuplicateOptimized(arr : IntArray):Boolean{
    val duplicateArr = hashMapOf<Int,Int>()
    for (i in arr){
        duplicateArr[i] = duplicateArr.getOrDefault(i,0)+1
    }

    for (i in duplicateArr.values){
        if(i>1){
            return true
        }
    }

    return false
}

//Arrays&hashing problem2

fun validAnagram(str1:String,str2:String):Boolean{

    if (str1.length != str2.length)
        return false

    val resultArr = IntArray(26){ 0 }

    for (i in str1.indices){
        resultArr[str1[i] - 'a'] +=1
        resultArr[str2[i] - 'a'] -=1
    }

    return resultArr.all { it == 0 }
}

//Arrays&hashing problem3 - two sum

fun twoSum(arr: IntArray,target : Int):IntArray{
    val resultHMap = hashMapOf<Int,Int>()

    for (i in arr.indices){
        resultHMap[target-arr[i]] = i
    }

    for (i in arr.indices){
        val remainingSum = target-arr[i]
        if (resultHMap.containsKey(remainingSum) && i != resultHMap[remainingSum]){
            return intArrayOf(i,resultHMap[remainingSum]!!)
        }
    }

    return intArrayOf(0,0)
}


fun majorityElement(arr:IntArray):Int{
    var count = 0
    var element = 0

    for (i in 0 until arr.size){
        if(count == 0){
            element = arr[i]
            count++
        } else if(arr[i] == element){
            count++
        } else{
            count--
        }
    }

    var count1 = 0
    for (i in 0 until arr.size){
        if (element == arr[i]){
            count1++
        }
    }

    if (count1>arr.size/2){
        return element
    }
    return -1
}

fun main() {
//    val arr = intArrayOf(1, 2, 3,3)
//
//    println("Contains Duplicate : ${containsDuplicateOptimized(arr = arr)}")

//    val str1 = "racecar"
//    val str2 = "carracs"
//
//    println("Valid Anagram : ${validAnagram(str1 = str1, str2 = str2)}")
//    val numbers = intArrayOf(5,5)
//    val target = 10

    //println("Two Sum : ${zohodsa.topic_01_arrays_hashing.twoSum(arr = numbers, target = target).joinToString()}")

    val arr = intArrayOf(2,2,1,1,)

    println("Majority Element : ${majorityElement(arr)}")
}