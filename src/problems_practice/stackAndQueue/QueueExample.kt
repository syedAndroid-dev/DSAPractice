package problems_practice.stackAndQueue

//Queue Using Array
class MyQueue(val size : Int){
    val queue = IntArray(size)
    var front = 0
    var rear = -1
    var count = 0

    fun enqueue(element:Int){
        if (count == size){
            println("Queue OverFlow")
            return
        }
        queue[++rear] = element
        count++
    }

    fun dequeue():Int{
        if (count == 0){
            println("Queue is underFlow")
            return -1
        }
        val value = queue[front]
        front++
        count--
        return value
    }

    fun peek():Int{
        if (count == 0) return -1
        return queue[front]
    }

    fun isEmpty(): Boolean = count == 0

    fun printQueue(){
        println("Queue : ${queue.joinToString()}")
    }
}

fun main() {
    val queue = MyQueue(4)
    queue.enqueue(10)
    queue.enqueue(20)
    queue.enqueue(30)
    queue.printQueue()
    println("Deque : ${queue.dequeue()}")
    println("Peek Element : ${queue.peek()}")
}