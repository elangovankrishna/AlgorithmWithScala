import scala.collection.mutable.ArrayBuffer

/** We are using Tail recursion which is very powerful concept in
  * any language
 *
  * @return Factorial
  */

var factList = ArrayBuffer[Int]()

def fact(n: Int): Int = {

  if (n == 0) 1 else n * fact(n -1)

  }

fact(4)