package problems_practice.dsa90


fun partitioning(arr:Array<ClassTime>,l:Int,h:Int):Int{
    val pivot = arr[l].start
    var i = l
    var j = h

    while (i<j){
        while (arr[i].start <= pivot){
            i++
        }
        while (arr[j].start > pivot){
            j--
        }
        if(i < j){
            val temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
        }
    }
    val temp = arr[l]
    arr[l] = arr[j]
    arr[j] = temp

    return j
}

fun quickSort1(arr:Array<ClassTime>,l:Int,h:Int){
    if(l<h){
        val pivot = partitioning(arr = arr, l = l,h = h)
        quickSort1(arr = arr,l = l, h = pivot)
        quickSort1(arr = arr, l = pivot+1, h = h)
    }
}

data class ClassTime(
    val start : Int = 0,
    val end : Int = 0
)

fun main() {

    val arr = arrayOf<ClassTime>(
        ClassTime(start = 0, end = 30), ClassTime(start = 5, end = 10),
        ClassTime(start = 15, end = 20)
    )

    quickSort1(arr, 0, arr.size - 1)

    for (i in 1..<arr.size){
        if (arr[i].start > arr[i-1].end){
            println("Not Able To Attend The Meeting")
        }
    }

    println("Sorted : ${arr.joinToString()}")
}