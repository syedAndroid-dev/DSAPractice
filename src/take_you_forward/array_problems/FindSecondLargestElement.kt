package take_you_forward.array_problems

fun secondLargestElement(input: IntArray):Int{
    var fistLargest = 0
    var secondLargest = 0

    for (i in input.indices) {
        if (input[i] > fistLargest) {
            secondLargest = fistLargest
            fistLargest = input[i]

        }

        if(input[i] in secondLargest..<fistLargest){
            secondLargest = input[i]
        }
    }

    return if (secondLargest == 0) -1 else secondLargest
}

fun main() {
    println("Find SecondLargest : ${secondLargestElement(input = intArrayOf(28078,19451,935,28892,2242,3570,5480,231))}")
}