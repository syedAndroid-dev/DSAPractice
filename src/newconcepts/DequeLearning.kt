package newconcepts

import java.util.ArrayDeque
import java.util.Deque

fun main() {
    //Deque Implementation

    val deque : Deque<Int> = ArrayDeque()

    deque.add(5)
    deque.add(1)
    println(deque)

    println("Remove First : ${deque.offerFirst(20)}")
    println("Remove First : ${deque.offerLast(25)}")
    println("Remove First : ${deque.addFirst(21)}")
    println("Remove First : ${deque.removeFirst()}")
    println("Remove First : ${deque.removeLast()}")
    println(deque)

}