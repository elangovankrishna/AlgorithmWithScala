package StackQueueDeque

/**
  * Created by ke20506 on 2/10/2017.
  */
class LinkedListStack[A] extends Stack[A] {

  private case class Node(data: A, next: Node)
  private var top: Node = null


  def push(a: A): Unit = {

    top = new Node(a, top)
  }

  def pop(): A = {
    val ret = top.data
    top = top.next
    ret
  }

  def isEmpty: Boolean = {
    if (top == null) true
    else false
  }

  def peek(): A = top.data

 }

