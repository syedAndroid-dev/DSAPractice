package take_you_forward.array_problems.hard

fun generatePascalTriangle(num:Int):List<List<Int>>{
    val pascalTriangle : MutableList<List<Int>> = mutableListOf()

    for (i in 0..<num){
        val tempList : MutableList<Int> = MutableList(i+1){ 1 }
        for (j in 1..<i){
            tempList[j] = pascalTriangle[i-1][j-1] + pascalTriangle[i-1][j]
        }

        pascalTriangle.add(tempList)
    }

    return pascalTriangle
}


fun main() {
    val num = 5

    generatePascalTriangle(num).forEach {
        println(it.joinToString())
    }
}