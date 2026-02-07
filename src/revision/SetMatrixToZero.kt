package revision

fun setMatrixToZero(array: Array<IntArray>){
    val rowSize = array.size
    val columnSize = array[0].size

    for (row in 0 until rowSize){    // 0 -> arr.size -> m
        for (col in 0 until columnSize){   // 0 -> arr.size -> n
            if (array[row][col] == 0){
                //mark row to -1
                for (i in 0 until array[row].size){  // n
                    if (array[row][i] != 0){
                        array[row][i] = -1
                    }
                }

                //mark column to -1
                for (j in 0 until array[col].size){ // m
                    if (array[j][col] != 0){
                        array[j][col] = -1
                    }
                }
            }
        }
    }

    for (i in 0 until rowSize){
        for (j in 0 until columnSize){  //n * m
            if (array[i][j] == -1){
                array[i][j] = 0
            }
        }
    }

    // Total -> (m*n) + (n+m) + n*m -> n3 + m3
}

fun setMatrixZeroBetter(array: Array<IntArray>){

}

fun main() {

    val arr = arrayOf(
        intArrayOf(1,1,1),
        intArrayOf(1,0,1),
        intArrayOf(1,1,1),
    )
    setMatrixToZero(array = arr)
    println(arr.joinToString { "${it.joinToString()} \n" })

}