package basics_arrays_hashing

fun encodeDecodeString(arr : List<String>):List<String>{
    //encode arrays into string by adding & seperate items
    //then split the string by &

    var encodedString = ""
    val result : ArrayList<String> = arrayListOf()
    var startIndex : Int = 0

    for(i in 0..<arr.size-1){
        encodedString += "${arr[i]}/"
    }
    encodedString += arr[arr.size-1]

    for(j in encodedString.indices){
        if(encodedString[j] == '/'){
            result.add(encodedString.substring(startIndex,j))
            startIndex = j+1
        }
    }
    result.add(encodedString.substring(startIndex,encodedString.length))

    return result
}


fun main() {
    val arr = listOf("neet","code","love","you")

    println(encodeDecodeString(arr = arr))
}