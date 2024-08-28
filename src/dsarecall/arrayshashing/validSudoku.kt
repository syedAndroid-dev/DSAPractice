package dsarecall.arrayshashing

fun checkValidSudoku(arr: List<List<Char>>): Boolean {

    val rowArr = Array(arr.size){ HashSet<Int>()}
    val columnArr = Array(arr.size){ HashSet<Int>()}
    val subMatrix = arrayOf(
        arrayOf(hashSetOf<Int>(),hashSetOf<Int>(),hashSetOf<Int>()),
        arrayOf(hashSetOf<Int>(),hashSetOf<Int>(),hashSetOf<Int>()),
        arrayOf(hashSetOf<Int>(),hashSetOf<Int>(),hashSetOf<Int>()),
    ) 
    
    for (i in 0..<arr.size){
        for (j in 0..<arr[i].size){
            //check current element .
            if (!arr[i][j].isDigit()){
                continue
            }

            //check row
            val value = Character.getNumericValue(arr[i][j])
            if(value in rowArr[j]){
                return false
            }
            rowArr[j].add(value)

            if(value in columnArr[i]){
                return false
            }
            columnArr[i].add(value)

            if (value in subMatrix[i/3][j/3]){
                return false
            }
            subMatrix[i/3][j/3].add(value)
        }
    }

    return true
}

fun main() {
    println(
        "check is Valid Sudoku : ${
            checkValidSudoku(
                arr = arrayListOf(
                    arrayListOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
                    arrayListOf('6','.','.','1','9','5','.','.','.'),
                    arrayListOf('.','9','8','.','.','.','.','6','.'),
                    arrayListOf('8','.','.','.','6','.','.','.','3'),
                    arrayListOf('4','.','.','8','.','3','.','.','1'),
                    arrayListOf('7','.','.','.','2','.','.','.','6'),
                    arrayListOf('.','6','.','.','.','.','2','8','.'),
                    arrayListOf('.','.','.','4','1','9','.','.','5'),
                    arrayListOf('.','.','.','.','8','.','.','7','9'),
                )
            )
        }"
    )
}