package take_you_forward.basicdatastructurecreation

data class Node(
    val data: Int,
    var next: Node? = null
)

class CustomLinkedList {

    var head: Node? = null

    fun insertEnd(data: Int) {
        if (head == null) {
            head = Node(data = data)
            return
        }

        var current = head
        while (current?.next != null) {
            current = current.next
        }
        current?.next = Node(data)
    }

    fun insertStart(data: Int) {
        val node = Node(data)
        node.next = head
        head = node
    }

    fun delete(data: Int) {
        if (head == null) return

        if (head!!.data == data) {
            head = head!!.next
            return
        }

        var current = head
        while (current?.next != null) {
            if (current.next!!.data == data) {
                current.next = current.next!!.next
                return
            }
            current = current.next
        }
    }

    fun print(){
        var current = head

        while (current != null){
            println("Current Data -> ${current.data}")
            current = current.next
        }

        println("null")
    }
}


fun main() {

    val customLinkedList = CustomLinkedList()

    customLinkedList.insertEnd(data = 10)
    customLinkedList.insertEnd(data = 20)
    customLinkedList.insertEnd(data = 30)
    customLinkedList.insertEnd(data = 40)
    customLinkedList.insertEnd(data = 50)
    customLinkedList.insertEnd(data = 60)

  //  customLinkedList.insertStart(data = 60)

    //customLinkedList.delete(data = 40)

    customLinkedList.print()
}