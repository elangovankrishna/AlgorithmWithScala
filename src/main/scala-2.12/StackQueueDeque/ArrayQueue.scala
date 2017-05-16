package StackQueueDeque

/**
  * Created by ke20506 on 3/19/2017.
  */
//   b
// 5 0 0 0 0
// f
class ArrayQueue[A: Manifest] extends Queue[A]{

  private val data = new Array[A](10)
  private var front = 0
  private var back = 0

  def enqueue(a: A): Unit = {
      data(back) = a
      back += 1
  }

  def dequeue():A = {
      val ret = data(front)
      front += 1
      ret
  }

  def isEmpty: Boolean = front == back

  def peek(): A = data(front)

}

object ArrayQueue {

  val testArrayQueue = new ArrayQueue[Int]

  testArrayQueue.isEmpty


  testArrayQueue.enqueue(5)
  testArrayQueue.enqueue(2)

  testArrayQueue.isEmpty
  testArrayQueue.peek()
  testArrayQueue.dequeue()

}