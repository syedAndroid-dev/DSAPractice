package newconcepts

class SimpleThread: Thread() {
    override fun run() {
        super.run()

        for (i in 0..100)
            println("Thread is running , Thread Name : ${this.name} ,is Alive : ${this.isAlive} ${i}")
    }
}


class SampleThread : Runnable{
    override fun run() {
        println("Thread is running 2, Thread Name : ${Thread.currentThread().name}")
    }

}

fun main() {
    val thread1 = SimpleThread()
    val thread2 = Thread(SampleThread())
  //  thread1.start()
    thread2.start()
}