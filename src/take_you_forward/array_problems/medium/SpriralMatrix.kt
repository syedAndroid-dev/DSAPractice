package take_you_forward.array_problems.medium


fun returnSpiralMatrix(nums : Array<IntArray>):List<Int>{
    val n = nums.size
    val m = nums[0].size

    val result = mutableListOf<Int>()

    var top = 0
    var bottom = n-1
    var left = 0
    var right = m-1

    while (top<=bottom && left<=right){

        //Left to right
        for (i in left..right){
            result.add(nums[top][i])
        }
        top++

        //RightEnd to Bottom
        for (j in top..bottom){
            result.add(nums[j][right])
        }
        right--

        //BottomEnd to Left
        if (top <= bottom) {
            for (k in right downTo left){
                result.add(nums[bottom][k])
            }
            bottom--
        }

        if (left <= right) {
            for (h in bottom downTo top){
                result.add(nums[h][left])
            }
            left++
        }
    }

    return result
}

fun main() {
    val arr = arrayOf<IntArray>(
        intArrayOf(1,2,3,4),
        intArrayOf(5,6,7,8),
        intArrayOf(9,10,11,12),
    )

    println("Spiral Matrix : ${returnSpiralMatrix(arr)}")
}