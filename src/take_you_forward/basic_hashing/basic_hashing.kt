package take_you_forward.basic_hashing


data class Syed(val name : String = "Syed",val age:Int)

fun printNumCheck(num:Int?){

    println( num?.let {
        "Non Nullable Values"
    })


}

fun main() {
//    val arr = IntArray(26){ 0 }
//    val chars = readln()
//
//    val chLength = chars.length
//    println("CH Length : ${chLength}")
//    //AMMA
//    for (i in 0..<chLength step 1){
//        val ch = chars[i]
//        println("Check : ${ch} -- ${ch-'a'}")
//        arr[ch-'a'] += 1
//    }
//
//    println("${arr.joinToString()}")



    printNumCheck(null)
}