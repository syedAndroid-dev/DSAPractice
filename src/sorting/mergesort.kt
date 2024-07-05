package sorting

fun mergeSort(arr: MutableList<Int>, left: Int, right: Int) {
    //diving array into half part until left and right values are same
    if (left < right) {
        val mid = left + (right - left) / 2     //finding mid values
        mergeSort(arr = arr, left = left, right = mid)  //dividing array into first half
        mergeSort(arr = arr, left = mid + 1, right = right) //dividing array into second half
        merge(arr = arr, left = left, mid = mid, right = right) //sort and merge the different half arrays
    }
}

fun merge(arr: MutableList<Int>, left: Int, mid: Int, right: Int) {

    val leftArrayStart = left  //left array starting index
    val rightArrayStart = mid+1 //right array starting index

    val leftHalf = IntArray(mid-left+1) //defining left array
    val rightHalf = IntArray(right-mid) //defining right array

    for (i in leftHalf.indices){  // filling divided left array values
        leftHalf[i] = arr[leftArrayStart+i]
    }

    for (j in rightHalf.indices){  //filling divided right array values
        rightHalf[j] = arr[rightArrayStart+j]
    }

    var index = left    //left index because
    var p1 = 0
    var p2 = 0

    while (p1<leftHalf.size && p2<rightHalf.size){
        if (leftHalf[p1] <= rightHalf[p2]){
            arr[index++] = leftHalf[p1]
            p1++
        } else{
            arr[index++] = rightHalf[p2]
            p2++
        }
    }

    while (p1 < leftHalf.size){
        arr[index++] = leftHalf[p1]
        p1++
    }

    while (p2 < rightHalf.size){
        arr[index++] = rightHalf[p2]
        p2++
    }
}

fun main() {
    val arr = mutableListOf(0,3,7,2,5,8,4,6,0,1)
    val left = 0
    val right = arr.size - 1
    println("before sort : $arr")
    println("---------sorting-----------")
    mergeSort(arr = arr, left = left, right = right)
    println("after sorting : $arr")
}
