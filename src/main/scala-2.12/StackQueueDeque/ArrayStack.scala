package StackQueueDeque

/**
  * Created by ke20506 on 3/10/2017.
  */
//5 2 0 0 0 0
//    ^
class ArrayStack[A: Manifest] extends Stack[A]{

  private val data = new Array[A](10)
  private var top = 0

  def push(el : A) = {
    data(top) = el
    top += 1
  }

  def pop(): A = {
    top -= 1
    data(top)
  }

  def isEmpty: Boolean = top == 0

  def peek(): A = data(top-1)

}

object ArrayStack {

  val testArrayStack = new ArrayStack[Int]

  testArrayStack.push(5)
  testArrayStack.pop()
}
