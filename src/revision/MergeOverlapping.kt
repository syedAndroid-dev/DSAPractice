package revision

data class Node(
    val first: Int,
    val second: Int
)


fun mergeOverlapping(input: Array<Node>): List<Node> {
    val result: MutableList<Node> = mutableListOf()
    input.sortBy { it.first }

    for (i in 1..<input.size) {
    }

    return listOf()
}



open class Student(open var name: String){
    init {
        println("InitExecutes ${name}")
    }

    fun getName(){

    }
}

class Checking{

}

data class Delegate(override var name: String, val age:String):Student(name)

fun main() {
//    val items = arrayOf(
//        Node(first = 1, second = 3),
//        Node(first = 2, second = 6),
//        Node(first = 8, second = 10),
//        Node(first = 15, second = 18),
//    )
//
//    mergeOverlapping(input = items)

    val check = Delegate(name = "Syed", age = "21")
    check.getName()
}