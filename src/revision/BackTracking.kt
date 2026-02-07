package revision

fun backTrackingSample(input:IntArray):MutableList<Int>{
    val generatedPermutation : MutableList<MutableList<Int>> = mutableListOf()

    backtrackToGeneratePermutation(num = input, start = 0, allPermutation = generatedPermutation)

    for (i in generatedPermutation){
        println(i.joinToString())
    }

    for (i in 0 until generatedPermutation.size){
        if (input.toMutableList() == generatedPermutation[i]){
            if (i == generatedPermutation.size - 1)
                return generatedPermutation.get(0);
            return generatedPermutation.get(i + 1);
        }
    }

    return mutableListOf()
}

fun swapNum(num:IntArray,i:Int,j:Int){
    val temp = num[i]
    num[i] = num[j]
    num[j] = temp
}

fun backtrackToGeneratePermutation(num:IntArray,start:Int,allPermutation : MutableList<MutableList<Int>>){
    //Base Case To add current generated permutation
    if (start == num.size){
        val temp = mutableListOf<Int>()
        for (i in num){
            temp.add(i)
        }
        allPermutation.add(temp)
        return
    }

    for (i in start..<num.size){
        swapNum(num,i, start)
        backtrackToGeneratePermutation(num, start+1, allPermutation)
        swapNum(num,i,start)
    }
}


// Optimal

fun nextPermutationOptimal(input:IntArray){

}


fun main() {
    println(
        backTrackingSample(input = intArrayOf(1,2,3))
    )

}