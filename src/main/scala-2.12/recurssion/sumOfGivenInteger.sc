/** This algorithm gives sum of the given integer like integer is 4321
  * it should give us 4+3+2+1 as its result.
  * This algo should only use Recursion
  */


def sumOfInteger(i: Int): Int = {

  val sep = i % 10
  println(sep)
  if(i == 0) i else sep + sumOfInteger(i/10)
}

sumOfInteger(4321)