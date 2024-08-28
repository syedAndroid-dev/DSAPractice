package newconcepts


fun main() {
    val arr: Array<Array<Int>> = arrayOf(
        arrayOf(2,3,4),
        arrayOf(5, 6, 7),
        arrayOf(8,9,10),
        arrayOf(11,12,13),
        arrayOf(14,15,16)
    )

    //printing spiral matrix :
    // 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

    var top = 0
    var bottom = arr.size-1
    var left = 0
    var right = arr[0].size-1

    while (top <= bottom && left <= right){

        //printing top
        for (i in left..right){
            print("${arr[top][i]} ")
        }
        top+=1

        //printing right
        for (i in top .. bottom){
            print("${arr[i][right]} ")
        }
        right-=1

        //printing rightbottom to leftstart
        if (top<=bottom){
            for (i in right downTo left){
                print("${arr[bottom][i]} ")
            }
            bottom -=1
        }

        if(left<=right){
            for (i in bottom downTo top){
                print("${arr[i][left]} ")
            }
            left+=1
        }
    }

}