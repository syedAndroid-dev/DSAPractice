package problems_practice.stackAndQueue

//Create Stack Using Array

class MyStack(val size : Int){
    val stack = IntArray(size)
    var top = -1

    fun push(element:Int){
        if(top == size){
            println("Unable To Add Stack because Stack is Full")
        }
        stack[++top] = element
    }

    fun pop():Int{
        if (top == -1){
            println("No Elements To Remove")
            return -1
        }
        return stack[top--]

    }

    fun peek():Int{
        if (top == -1){
            println("No Elements To Remove")
            return -1
        }
        return stack[top]
    }

    fun isEmpty():Boolean{
        return top == -1
    }

    fun printStack(){
        println("Stack : ${stack.joinToString()}")
    }
}

fun main() {
    val stack = MyStack(size = 4)
    stack.push(10)
    stack.printStack()
    stack.push(20)
    stack.printStack()
    stack.push(30)
    stack.printStack()
    stack.push(40)
    stack.printStack()
    println(stack.peek())

}