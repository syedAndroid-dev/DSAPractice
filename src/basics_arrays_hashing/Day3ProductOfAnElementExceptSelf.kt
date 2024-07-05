package basics_arrays_hashing


fun method1ProductElementExceptSelf(inputArr : List<Int>):List<Int>{
    val listSize = inputArr.size
    val preFix = MutableList(listSize){ 1 }
    val postFix = MutableList(listSize){ 1 }
    val outPutArr = MutableList(listSize){ 1 }

    for (i in 1..<listSize){
        preFix[i] = preFix[i-1] * inputArr[i-1]
    }

    for (j in listSize-2 downTo 0 ){
        postFix[j] = postFix[j+1] * inputArr[j+1]
    }

    for (k in 0..<listSize){
        outPutArr[k] = preFix[k] * postFix[k]
    }

    println(preFix)
    println(postFix)

    println(outPutArr)

    return outPutArr
}

fun method2ProductElementExceptSelf(inputArr: List<Int>):List<Int>{
    val listSize = inputArr.size
    val result = MutableList(listSize){ 1 }
    var preFix = 1
    var postFix = 1
//[1,2,3,4]
    for (i in 0..<listSize){
        result[i] = preFix    //[1,1,2,6]
        preFix *= inputArr[i]
    }

    for (j in listSize-1 downTo 0){
        result[j] *= postFix //[1,1,2,6]
        postFix *= inputArr[j]
    }

    return result
}


fun main() {

    val inputArr = listOf(1,2,3,4)

  //  println("product of an Array method01 : ${method1ProductElementExceptSelf(inputArr = inputArr)}")
    println("product of an Array method02 : ${method2ProductElementExceptSelf(inputArr = inputArr)}")
}