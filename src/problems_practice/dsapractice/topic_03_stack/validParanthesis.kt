package problems_practice.dsapractice.topic_03_stack

import java.util.Stack

fun isValidParanthesis(arr : String): Boolean{

    val parenthesisStack = Stack<Char>()

    for (i in arr){
        if (i == '(' || i == '{' || i == '['){
            parenthesisStack.push(i)
        } else {
            if(parenthesisStack.isNotEmpty() && i == ')' && parenthesisStack.peek() == '('){
                parenthesisStack.pop()
            } else if(parenthesisStack.isNotEmpty() && i == '}' && parenthesisStack.peek() == '{'){
                parenthesisStack.pop()
            } else if (parenthesisStack.isNotEmpty() && i == ']' && parenthesisStack.peek() == '['){
                parenthesisStack.pop()
            } else {
                return false
            }
        }

    }

    return parenthesisStack.isEmpty()
}

fun main() {

    var paranthesis = "}"
    println("is Valid Paranthesis : ${isValidParanthesis(arr = paranthesis)}")
}