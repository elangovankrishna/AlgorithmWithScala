package StackQueueDeque

/**
  * Created by ke20506 on 2/10/2017.
  * these are FIFO
  */
trait Queue[A] {

  def enqueue(a: A): Unit

  def dequeue(): A

  def isEmpty: Boolean

  //def peek(): Option[A]
  def peek(): A

}
