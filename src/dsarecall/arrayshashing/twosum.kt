package dsarecall.arrayshashing


fun twoSum(array: IntArray,target : Int):IntArray{
    val hMap = hashMapOf<Int,Int>()

    for (i in array.indices){
        val difference = target - array[i]
        if (hMap.containsKey(difference)){
            return intArrayOf(hMap.getOrDefault(difference,0),i)
        }
        hMap[array[i]] = i
    }
    return intArrayOf(0,0)
}
fun main() {
    val arr = intArrayOf(2,7,11,15)

    println("find two sum : ${twoSum(array = arr, target = 9)}")
}