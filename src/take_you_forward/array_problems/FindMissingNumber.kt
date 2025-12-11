package take_you_forward.array_problems

fun findMissingNumber(arr: IntArray):Int{

    for (i in 1..arr.size){
        var isMissing = 0

        for (j in 0..<arr.size){
            if (i == arr[j]) {
                isMissing = 1
                break
            }
        }

        if (isMissing == 0){
            return i
        }
    }
    return -1
}

fun findMissingNumXor(nums:IntArray):Int{
    var xorOne: Int = 0
    var xorTwo: Int = 0

    for(i in 0..<nums.size-1){
        xorOne = xorOne xor i
        xorTwo = xorTwo xor  nums[i]
    }

    xorOne = xorOne xor nums.size

    return xorOne xor xorTwo
}

fun main() {
    val arr = intArrayOf(0, 1, 2, 4, 5, 6)

    println("Missing Number : ${findMissingNumber(arr)}")
}