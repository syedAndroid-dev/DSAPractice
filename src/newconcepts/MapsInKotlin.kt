package newconcepts

import java.util.TreeMap


fun main() {
    //Map Types
    //1.Immutable Map
    //2.Mutable Map - MutableMap,HashMap,LinkedHashMap,TreeMap

    //1.Immutable Map - readOnly,
    // 2.MutableMap - read,update,remove

    val immutableMp: Map<Int, String> = mapOf(1 to "syed", 2 to "naba", 3 to "balaji", 4 to "maruthu")

//    immutableMp.forEach { (key, value) ->
//        println("key : ${key} ----> value : ${value}")
//    }


    val mutableMp: MutableMap<Int, String> = mutableMapOf(
        Pair(first = 1, second = "syed"),
        Pair(first = 2, second = "naba"),
        Pair(first = 3, second = "balaji"),
        Pair(first = 4, second = "maruthu"),
    )

//    mutableMp.forEach { (key, value) ->
//        println("key : ${key} ----> value : ${value}")
//    }


    val hashMp : Map<Int,String> = linkedMapOf(
        Pair(first = 5, second = "syed"),
        Pair(first = 2, second = "naba"),
        Pair(first = 1, second = "balaji"),
        Pair(first = 3, second = "maruthu"),
    )

//    hashMp.forEach { (key, value) ->
//        println("key : ${key} ----> value : ${value}")
//    }

    val treeMp : TreeMap<Int,String> = TreeMap<Int,String>()
    treeMp[5] = "mohamed"
    treeMp[2] = "ahmed"
    treeMp[3] = "ahmed"
    treeMp[1] = "jalal"

    println(treeMp)

    treeMp.forEach { (key, value) ->
        println("key : ${key} ----> value : ${value}")
    }


}