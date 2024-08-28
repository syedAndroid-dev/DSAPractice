package dsarecall.arrayshashing


fun findDuplicate(arr : IntArray):Boolean{
    val hSet = HashSet<Int>()

    for (i in arr){
        if (hSet.contains(i)){
            return true
        } else {
            hSet.add(i)
        }
    }
    return false
}

fun main() {
    val arr = intArrayOf(1,2,3,1)

    println("Find Duplicate ; ${findDuplicate(arr = arr)}")

}