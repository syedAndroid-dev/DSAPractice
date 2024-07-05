package basics_arrays_hashing


fun isValidSudoku(board: Array<CharArray>): Boolean {

    val sudokuSize = board.size
    val columnHSet: MutableMap<Int,MutableSet<Char>> = mutableMapOf()
    val rowHSet: MutableMap<Int,MutableSet<Char>> = mutableMapOf()
    val boxHSet: MutableMap<Pair<Int, Int>,MutableSet<Char>> = mutableMapOf()

    for (row in 0..<sudokuSize) {
        for (column in 0..<sudokuSize) {

            if (board[row][column] == '.') {
                continue
            }
            if(rowHSet[row]?.contains(board[row][column]) == true ||
                columnHSet[column]?.contains(board[row][column]) == true ||
                boxHSet[Pair(first = row/3, second = column/3)]?.contains(board[row][column]) == true){
                return false
            }
            columnHSet[column]?.add(board[row][column])
            rowHSet[row]?.add(board[row][column])
            boxHSet[Pair(first = row/3, second = column/3)]?.add(board[row][column])
        }
    }

    return true
}


fun isValidSudoKuSingleHashSet(board :Array<CharArray>):Boolean{
    val sudokuSize = board.size
    val hSet : MutableSet<String> = mutableSetOf()

    for(i in 0..<sudokuSize){
        for (j in 0..<board[i].size){
            val currentChar = board[i][j]
            if(currentChar != '.'){
                if(!hSet.add("row $i $currentChar") || !hSet.add("column $j $currentChar") || !hSet.add("grid ${currentChar+i/3+j/3}")){
                    return false
                }
            }
        }
    }
    return true
}

fun isValidSudoKuMultipleApproach(board: Array<CharArray>):Boolean{

    val rowArr = Array(9){ HashSet<Int>() }
    val columnArr = Array(9){ HashSet<Int>() }
    val subMatrixHashSet = arrayOf(
        arrayOf(HashSet(),HashSet(),HashSet()),
        arrayOf(HashSet(),HashSet(),HashSet()),
        arrayOf(HashSet(),HashSet(),HashSet<Int>())
    )

    for(i in 0..<9){
        for (j in 0..<9){
            if (!board[i][j].isDigit())
                continue
            val value = Character.getNumericValue(board[i][j])

            if(value in columnArr[i])
                return false
            columnArr[i].add(value)

            if(value in rowArr[j])
                return false
            rowArr[j].add(value)

            if(value in subMatrixHashSet[i/3][j/3])
                return false
            subMatrixHashSet[i/3][j/3].add(value)
        }
    }

    return true
}

fun main() {
    val board = arrayOf(
                    //0,//1, //2, //3, //4, //5, //6, //7, //8,
        charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'), //0
        charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'), //1
        charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'), //2
        charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'), //3
        charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'), //4
        charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'), //5
        charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'), //6
        charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'), //7
        charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9'), //8
    )

    println("is valid sudoku : ${isValidSudoKuMultipleApproach(board = board)}")

    //finding sudoku row valid or not

    //finding sudoku column valid or not

    //each 3*3 column valid or not
}