package problems_practice.basics_arrays_hashing

class CustomHashSet(){
    private var currentArrSize = 10
    private var currentIndex = 0
    private var hashSetArr = IntArray(10)

    fun add(element: Int){
        if (!contains(element)){
            if (isArraySizeNotEndReached()){
                hashSetArr[currentIndex++] = element
            } else {
                hashSetArr = hashSetArr.copyOf(currentArrSize*2)
                currentArrSize *= 2
            }
        }
    }

    fun remove(element: Int){
        var removeElementIndex = 0
        for (arrIndex in hashSetArr.indices){
            if (element == hashSetArr[arrIndex]){
                removeElementIndex = arrIndex
            }
        }

        for (replaceIndex in removeElementIndex..<hashSetArr.size-2){
            val nextValue = hashSetArr[replaceIndex+1]
            hashSetArr[replaceIndex] = nextValue
        }
    }

    fun contains(element: Int):Boolean{
        for (arr in hashSetArr){
            if (element == arr){
                return true
            }
        }
        return false
    }

    private fun isArraySizeNotEndReached():Boolean{
        return currentIndex < currentArrSize
    }
}

fun main(){
    val customHashSet = CustomHashSet()
    customHashSet.add(1)
    customHashSet.add(2)
    customHashSet.contains(1)
    customHashSet.contains(3)
    customHashSet.add(2)
    customHashSet.contains(2)
    customHashSet.remove(2)
    customHashSet.contains(2)
}