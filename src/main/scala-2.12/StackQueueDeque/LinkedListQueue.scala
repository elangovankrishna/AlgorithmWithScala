package StackQueueDeque

/**
  * Created by ke20506 on 2/10/2017.
  */
class LinkedListQueue[A] extends Queue[A]{

  private case class Node(data: A, var next: Node)

  private var front: Node = null
  private var back: Node = null

  def enqueue(a: A): Unit = {

    if(back == null){
      front = new Node(a,null)
      back = front
    } else {
      back.next = new Node(a, null)
      back = back.next
    }
  }

  def dequeue(): A = {
    val ret = front.data
    front = front.next
    if(front == null) back = null
    ret
  }

  def isEmpty: Boolean = {
    if (front==null && back==null) true
    else false
  }

  def peek(): A = {
    if (front == null) throw new Error("List is Empty")
    else
    front.data
  }


  //def peek(): Option[A] = Option(front).map(_.data)
}
