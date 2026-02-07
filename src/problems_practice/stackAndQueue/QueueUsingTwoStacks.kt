package problems_practice.stackAndQueue

class QueueUsingTwoStacks(val size : Int){
    val stack1 = IntArray(size)
    val stack2 = IntArray(size)
    var stack1Top = -1
    var stack2Top = -1

    fun push(element:Int){
        if (stack1Top == -1){
            stack1[++stack1Top] = element
        } else {
            while (stack1Top >= 0){
                stack2[++stack2Top] = stack1[stack1Top--]
            }
            stack1[++stack1Top] = element

            while (stack2Top >= 0){
                stack1[++stack1Top] = stack2[stack2Top--]
            }
        }
    }

    fun pop():Int{
        val value = stack1[stack1Top]
        stack1[stack1Top--] = 0
        return value
    }

    fun printAllElement(){
        println("Stack1 : ${stack1.joinToString()}")
    }
}

fun main() {
    val queueUsingTwoQueue = QueueUsingTwoStacks(size = 4)
    queueUsingTwoQueue.push(10)
    queueUsingTwoQueue.push(20)
    queueUsingTwoQueue.push(30)
    queueUsingTwoQueue.printAllElement()
    queueUsingTwoQueue.pop()
    queueUsingTwoQueue.pop()
    queueUsingTwoQueue.printAllElement()
}