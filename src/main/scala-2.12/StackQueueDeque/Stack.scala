package StackQueueDeque

/**
  * Created by ke20506 on 2/10/2017.
  * These are LIFO
  */
trait Stack[A] {

  def push(a: A): Unit

  def pop(): A

  def isEmpty: Boolean

  def peek(): A



}
