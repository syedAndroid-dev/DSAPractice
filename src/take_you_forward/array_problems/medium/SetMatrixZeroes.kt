package take_you_forward.array_problems.medium

fun changeElementToRowAndColumnToZero(nums: Array<IntArray>, row: Int, column: Int) {
    //Left
    for (i in column - 1 downTo 0) {
        nums[row][i] = 0
    }

    //right
    for (j in column..<nums.size) {
        nums[row][j] = 0
    }

    //Top
    for (k in row - 1 downTo 0) {
        nums[k][column] = 0
    }

    //Bottom
    for (k in row..<nums.size) {
        nums[k][column] = 0
    }
}

fun setMatrixZeroes(nums: Array<IntArray>) {
    for (i in 0..<nums.size) {    // Row
        for (j in 0..<nums.size) {  // Column
            if (nums[i][j] == 0) { // ElementFount
                println("SetMatrix : ${i} -- ${j}") //ith row and jth column

                for (col in 0..<nums.size) {
                    if (nums[i][col] != 0) {
                        nums[i][col] = -1
                    }
                }

                for (row in 0..<nums.size) {
                    if (nums[row][j] != 0) {
                        nums[row][j] = -1
                    }
                }
            }
        }
    }

    for (i in 0..<nums.size) {
        for (j in 0..<nums.size) {
            if (nums[i][j] == -1){
                nums[i][j] = 0
            }
        }

    }
}


fun setMatrixBrute(nums:Array<IntArray>){
    val row = IntArray(nums.size){ 0 }
    val column = IntArray(nums[0].size) { 0 }

    for (rowi in 0..<nums.size){
        for (colj in 0..<nums[0].size){
            if (nums[rowi][colj] == 0){
                row[rowi] = 1
                column[colj] = 1
            }
        }
    }

    for (i in 0..<nums.size){
        for (j in 0..<nums[0].size){
            if (row[i] == 1 || column[j] == 1) {
                nums[i][j] = 0
            }
        }
    }
}

fun setMatrixOptimal(nums:Array<IntArray>){
    var col0 = 1
    for (i in 0..<nums.size){
        for (j in 0..<nums[0].size){
            if (nums[i][j] == 0){
                //reuseColumn for row
                nums[i][0] = 0

                if (j !=0){
                    nums[0][j] = 0
                } else {
                    col0 = 0
                }
            }
        }
    }

    for (i in 1..<nums.size){
        for (j in 1..<nums[0].size){
            if (nums[i][j] != 0){
                if (nums[0][j] == 0 || nums[i][0] == 0){
                    nums[i][j] = 0
                }
            }
        }
    }

    if (nums[0][0] == 0){
        for (j in 0..<nums[0].size){
            nums[0][j] = 0
        }
    }

    if (col0 == 0){
        for (i in 0..<nums.size){
            nums[i][0] = 0
        }
    }
}

fun main() {
    val matrix = arrayOf(
        intArrayOf(1, 1, 1),
        intArrayOf(1, 0, 1),
        intArrayOf(1, 1, 1))

    val matri2 = arrayOf(
        intArrayOf(0,1,2,0),
        intArrayOf(3,4,5,2),
        intArrayOf(1,3,1,5)
    )

    println("Before : ${matri2}")
    setMatrixOptimal(nums = matri2)
    println("After : ${matri2.map { it.joinToString() }}")

}