package problems_practice.practice

fun joinTwoSortedArr(nums1: IntArray, nums2: IntArray, l: Int, r: Int) {
    var num1Size = l
    var num2Size = r
    var last = num1Size + num2Size - 1

    while (num1Size > 0 && num2Size > 0){
        if (nums1[num1Size-1] > nums2[num2Size-1]){
            nums1[last] = nums1[num1Size-1]
            num1Size--
        } else {
            nums1[last] = nums2[num2Size-1]
            num2Size--
        }
        last--
    }

    while (num2Size > 0){
        nums1[last] = nums2[num2Size-1]
        num1Size--
        last--
    }
}


fun main() {
    val arr1 = intArrayOf(1,2,3,0,0,0)
    val arr2 = intArrayOf(2,5,6)

    joinTwoSortedArr(nums1 = arr1, nums2 = arr2, l = 3, r = arr2.size)
    println("Arr1 : ${arr1.joinToString()}")
}