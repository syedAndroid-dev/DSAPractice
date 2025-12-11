package take_you_forward.array_problems.medium

fun reArrangeTheArrayBySign(nums: IntArray){
    var right = nums.size-1
    while (right>0){
        if (nums[right]>0){
            var i = right
            while (i>0 && nums[i] > 0){
                if (nums[i-1] > 0) break
                val temp = nums[i]
                nums[i] = nums[i-1]
                nums[i-1] = temp
                i--
            }
            right = i
        }
        right--
    }

    var left = 1
    var tmpRight = nums.size/2

    while (left < nums.size/2 && tmpRight < nums.size){

    }
}

fun reArrangeTheArrayBySign1(nums: IntArray):IntArray{
    val ans = IntArray(nums.size){ 0 }
    var positive = 0
    var negative = 1

    for (i in 0..<nums.size){
        if (nums[i] > 0){
            ans[positive] = nums[i]
            positive +=2
        } else {
            ans[negative] = nums[i]
            negative +=2
        }
    }

    return ans
}

fun main() {
    val arr = intArrayOf(3,1,-2,-5,2,-4)
    println("Before ReArranging : ${arr.joinToString()}")
  //  reArrangeTheArrayBySign1(nums = arr)
    println("After ReArranging : ${reArrangeTheArrayBySign1(arr).joinToString()}")
}