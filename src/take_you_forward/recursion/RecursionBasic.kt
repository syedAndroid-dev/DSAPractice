package take_you_forward.recursion


//Parameterized and Functional Recursion
fun fact(num:Int,fac:Int){
    if (num > 1){
        println(fac)
        return
    }
    fact(num-1,fac*num)
}

//Sum Of N Numbers Parameterized
fun sumOfNNumbers(num:Int,sum:Int){
    if (num == 0){
        println("Sum Using Parameterized : $sum")
        return
    }
    sumOfNNumbers(num = num-1,sum=sum+num)
}

//Sum Of N Numbers Functional
fun sumOfNNumberFunctional(num:Int){

}

fun printNameNTimes(num:Int){
    if(num<1){
        return
    }
    println("Syed")
    printNameNTimes(num = num-1)
}

//ReverseArrayUsingRecursion
fun revArrRecursion(index:Int,arr:IntArray,size:Int){
    //base case
    if (index >= size-index-1){
        return
    }

    //swap logic
    val temp = arr[size-index-1]
    arr[size-index-1] = arr[index]
    arr[index] = temp

    //Recursive Call
    revArrRecursion(index+1, arr, size)
}

//CheckPalindromeUsingRecursion
fun checkPalindromeUsingRecursion(index: Int,name:String){
    if(name[index] != name[name.length-index-1]){
        println("${name} is Not Palindrome")
        return
    }
    if (index >= name.length/2){
        println("${name} is Palindrome")
        return
    }
    checkPalindromeUsingRecursion(index = index+1, name = name)
}

fun main(args: Array<String>) {
    val n = 5
    //printNameNTimes(num = n)
    //sumOfNNumbers(num = n, sum = 0)
//
//    val arr = intArrayOf(1,2,3,4,5)
//
//    println("Before Swapping : ${arr.joinToString()}")
//
//    revArrRecursion(index = 0, arr = arr, size = 5)
//
//    println("Afrer Swapping : ${arr.joinToString()}")

    val str = "MADA"
    checkPalindromeUsingRecursion(index = 0, name = str)
}