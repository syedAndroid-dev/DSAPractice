package two_pointer

fun threeSumSortedArray(arr : MutableList<Int>):MutableList<List<Int>>{

    val result : MutableList<List<Int>> = mutableListOf()
    arr.sort()
    for(i in 0..<arr.size-1){

        if(i == 0 || (i > 0 && arr[i] != arr[i-1])){
            var low = i+1
            var high = arr.size-1
            val sum = 0-arr[i]

            while (low<high){
                if(arr[low] + arr[high] == sum){
                    result.add(listOf(arr[i],arr[low],arr[high]))
                    while (low<high && arr[low] == arr[low+1]) low++
                    while (low<high && arr[high] == arr[high-1]) high--
                    low++
                    high--
                } else if(arr[low] + arr[high] > sum){
                    high--
                } else{
                    low++
                }
            }
        }
    }

    return result
}

fun main() {
    val nums = mutableListOf(-1,0,1,2,-1,-4)
    println("three sum arr : ${threeSumSortedArray(arr = nums)}")
}