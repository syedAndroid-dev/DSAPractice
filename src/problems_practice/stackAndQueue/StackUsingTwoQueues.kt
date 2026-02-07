package problems_practice.stackAndQueue

class MyStackUsingTwoQueue{
    val q1 = ArrayDeque<Int>()
    val q2 = ArrayDeque<Int>()

    fun push(element:Int){
        q2.addLast(element)

        while (q1.isNotEmpty()){
            q2.addLast(q1.removeFirst())
        }
        q1.clear()
        q1.addAll(q2)
        q2.clear()
    }

    fun pop():Int{
        if (q1.isEmpty()){
            println("No Elements in Top")
            return -1
        }

        return q1.removeFirst()
    }

    fun printAllElements(){
        println("${q1.joinToString()}")
    }
}

fun main() {
    val myStack = MyStackUsingTwoQueue()

    myStack.push(10)
    myStack.push(20)
    myStack.push(30)
    myStack.push(40)
    myStack.printAllElements()
    myStack.pop()
    myStack.printAllElements()

}