package binary_search_problems

import java.util.TreeMap

class TimeBaseStore{

    private val timeBasedMp : TreeMap<String,TreeMap<Int,String>> = TreeMap<String,TreeMap<Int,String>>()

    fun store(key:String,value:String,timeStamp:Int) {
        if(!timeBasedMp.containsKey(key)){
            timeBasedMp[key] = TreeMap<Int,String>()
        }
        timeBasedMp[key]?.set(timeStamp, value)
    }

    fun get(key: String,timeStamp: Int) : String{
        val mp = timeBasedMp[key] ?: return ""
        val floor = mp.floorKey(timeStamp) ?: return ""
        return mp[floor] ?: ""
    }
}

class TimeBaseStore1{

    private val timeBasedMp : TreeMap<String,MutableList<Pair<Int,String>>> = TreeMap<String,MutableList<Pair<Int,String>>>()

    fun store(key:String,value:String,timeStamp:Int){
        if (!timeBasedMp.containsKey(key))
            timeBasedMp[key] = mutableListOf()
        timeBasedMp[key]?.add(Pair(first = timeStamp, second = value))
    }

    fun get(key: String,timeStamp: Int) : String{
        val mp = timeBasedMp[key]!!
        var left = 0
        var right = mp.lastIndex

        while (left <= right){
            val mid = left+right/2
            if(mp[mid].first == timeStamp){
                return mp[mid].second
            } else if(mp[mid].first > timeStamp){
                right = mid-1
            } else {
                left = mid+1
            }
        }
        if (right < 0)
            return ""
        return mp[right].second
    }

}

fun main() {

    val timeBaseMp = TimeBaseStore1()

    timeBaseMp.store(key = "alice", value = "happy", timeStamp = 1)
    timeBaseMp.store(key = "alice", value = "sad", timeStamp = 3)

    println("most occurencevalue : ${timeBaseMp.get(key = "alice", timeStamp = 3)}")
}