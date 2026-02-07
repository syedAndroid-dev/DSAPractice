package take_you_forward.linked_list

data class Node(
    val data:Int,
    var next : Node? = null
)

class MyLinkedList(num : Int){
    var head : Node = Node(data = num)

    fun insertHead(num:Int){
        val node = Node(data = num)
        node.next = head
        head = node
    }

    fun insertEnd(num:Int){
        var current = head
        while (current.next != null){
            current = current.next!!
        }
        current.next = Node(data = num)
    }

    fun removeNode(num: Int){
        val current = head
        while (current.next != null){
            if (current.data == num){
                val next = current.next

            }
        }
    }

    fun printLikedList(){
        var current : Node? = head
        while (current != null){
            print("${current.data} -> ")
            current = current.next
        }
    }
}

fun main() {
    val myLinkedList = MyLinkedList(num = 10)
    myLinkedList.insertEnd(20)
    myLinkedList.insertEnd(30)
    myLinkedList.insertEnd(40)
    myLinkedList.insertEnd(50)
    myLinkedList.insertEnd(60)
    myLinkedList.insertEnd(70)
    myLinkedList.insertEnd(80)
    myLinkedList.insertEnd(90)
    myLinkedList.insertEnd(100)

    myLinkedList.printLikedList()

}