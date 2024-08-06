package linkedlist

data class Node(
    var value : Int,
    var next : Node? = null
)


fun reorderLinkedList(head : Node):Node{
    return Node(value = 1, next = null)
}


fun main() {

    //Reorder LinkedList
    var currentNode = Node(value = 1)
//    currentNode.next = Node(value = 2)
//    currentNode.next = Node(value = 3)
//    currentNode.next = Node(value = 4)

    var i = 0
    while (i < 3 && currentNode != null){
        currentNode.next = Node(value = ++i)
        currentNode = currentNode.next!!
    }

    //Slow and Fast Pointer
    //find the middle and last node
    //reverse the second part
    //reconnect first and second part

    println("current Node : ${currentNode.value} , ${currentNode.next}")
    //var slow : Node = currentNode



}