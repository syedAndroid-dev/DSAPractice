package linkedlist

class Node1(var key: Int = 0,var value: Int = 0,var prev: Node1? = null,var next: Node1? = null) {
}

class LRUCache(capacity: Int) {
    val myCache : HashMap<Int,Node1> = hashMapOf()
    val capacity = capacity
    //LeastCommonUsed
    var left : Node1? = Node1(0,0)
    //MostCommonUsed
    var right : Node1? = Node1(0,0)

    init {
        left?.next = right
        right?.prev = left
    }

    fun insert(node : Node1?){
        val prev = node?.prev
        val next = node?.next
        prev?.next = next
        next?.prev = prev
    }

    fun remove(node : Node1?){
        node?.prev?.next = node?.next
        node?.next?.prev = node?.prev
    }

    fun get(key: Int): Int {
        if(key in myCache){
            remove(myCache[key])
            insert(myCache[key])
            return myCache[key]?.value ?: 0
        }
        return -1
    }

    fun put(key: Int, value: Int) {
        if(key in myCache){
            remove(myCache[key])
        }
        myCache[key] = Node1(key,value)
        insert(myCache[key])

        if(myCache.size > capacity){
            val lru = left?.next
            remove(lru)
            myCache.remove(lru?.key)
        }
    }
}


fun main() {
    val lruCache = LRUCache(capacity = 2)
    println("${lruCache.put(key = 1, value = 1)}")
    println("${lruCache.put(key = 2, value = 2)}")
    println("${lruCache.get(key = 1)}")
    println("${lruCache.put(key = 3, value = 3)}")
    println("${lruCache.get(key = 2)}")
    println("${lruCache.put(key = 4, value = 4)}")
    println("${lruCache.get(key = 1)}")
    println("${lruCache.get(key = 3)}")
    println("${lruCache.get(key = 4)}")

}