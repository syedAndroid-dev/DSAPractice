package problems_practice.dsa90

fun squareOfSortedArray(arr:IntArray):IntArray{
    val resultArr = IntArray(arr.size)
    var left = 0
    var right = arr.size-1
    var pos = arr.size-1

    while (left<=right){
        val leftSqr = arr[left] * arr[left]
        val rightSqr = arr[right] * arr[right]

        if(leftSqr < rightSqr){
            resultArr[pos] = rightSqr
            right--
        } else {
            resultArr[pos] = leftSqr
            left++
        }
        pos--
    }
    return resultArr
}

fun main() {

    val arr = intArrayOf(-7,-3,2,3,11)

    println("Before Arr : ${arr.joinToString()}")

    println("After Arr : ${squareOfSortedArray(arr = arr).joinToString()}")

}