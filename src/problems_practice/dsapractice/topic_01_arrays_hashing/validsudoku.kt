package problems_practice.dsapractice.topic_01_arrays_hashing

fun isValidSudoku(arr : Array<CharArray>):Boolean{

    val ansCheckHashSet = HashSet<Char>()

    //iterating all the array rows
    for (i in arr.indices){
        //iterating each row elements
        for (j in arr.indices){
            println(arr[i][j])
            if(arr[i][j] == '.'){
                continue
            }
            if (ansCheckHashSet.contains(arr[i][j])){
                return false
            } else {
                ansCheckHashSet.add(arr[i][j])
            }
        }
        ansCheckHashSet.clear()
        for (j in arr.indices){
            println(arr[j][i])
            if(arr[j][i] == '.'){
                continue
            }
            if (ansCheckHashSet.contains(arr[j][i])){
                return false
            } else {
                ansCheckHashSet.add(arr[j][i])
            }
        }
        ansCheckHashSet.clear()
    }

    return true
}

fun isValidSudoku2(arr : Array<CharArray>):Boolean{
    val ansHSet = hashSetOf<String>()

    for (i in arr.indices){
        for (j in arr.indices){
            if (arr[i][j] == '.'){
                continue
            }
            val b = "(${arr[i][j]})"
            if(!ansHSet.add("${b}${i}") || !ansHSet.add("${j}${b}") || !ansHSet.add("${i/3}$b${j/3}")){
                return false
            }
        }
    }

    return true
}

fun isValidSudoKo3(board : Array<CharArray>):Boolean{
    val rowArr = IntArray(9){ 0 }
    val columnArr = IntArray(9){ 0 }
    val boxArr = IntArray(9){0}

    for (i in board.indices){
        for (j in board.indices){
            if(board[i][j] == '.'){
                continue
            }

            val num = board[i][j] - '1'
            val mask = 1 shl num
            val boxIndex = (i/3)*3+(j/3)
            if ((rowArr[i] and mask) != 0 || (columnArr[j] and mask) != 0 || (boxArr[boxIndex] and mask) != 0){
                return false
            }
            rowArr[i] = rowArr[i] or mask
            columnArr[j] = columnArr[j] or mask
            boxArr[boxIndex] = boxArr[boxIndex] or mask
        }
    }
    return true
}

fun main() {

    val arr = arrayOf(
        charArrayOf('5','3','.','.','7','.','.','.','.'),
        charArrayOf('6','.','.','1','9','5','.','.','.'),
        charArrayOf('.','9','8','.','.','.','.','6','.'),
        charArrayOf('8','.','.','.','6','.','.','.','3'),
        charArrayOf('4','.','.','8','.','3','.','.','1'),
        charArrayOf('7','.','.','.','2','.','.','.','6'),
        charArrayOf('.','6','.','.','.','.','2','8','.'),
        charArrayOf('.','.','.','4','1','9','.','.','5'),
        charArrayOf('.','.','.','.','8','.','.','7','9'),
    )
  //  println("Is Valid Sudoku : ${isValidSudoKo3(board = arr)}")

    val m = 'A'
    m.code
    println(m-'A')
//    val s = '9'-'1'
//
//    var m = 1 shl s
//    m = m or m
//    println((m and m).toBinaryDigits())
//
//    println(m.toBinaryDigits())
}

fun Int.toBinaryDigits():String{
    var num = this
    val result = StringBuilder()
    while (num > 0){
        val remainder = num % 2
        result.append(remainder)
        num /= 2
    }
    return result.reverse().toString()
}