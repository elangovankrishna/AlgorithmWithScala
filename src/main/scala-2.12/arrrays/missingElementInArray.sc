import scala.collection.mutable.ArrayBuffer

/** There are different solutions to this problem and i am implementing
  * one of them here
  * Solution 1. Add both the elements in the Array and subtract them the
  * difference would be the missing element - this method would throw out
  * bound exception if the Array length is too long.
  * Solution 2. is based on XOR (Exclusive or) this is of complexity O(log n) */


def find(xs: ArrayBuffer[Int], ys: ArrayBuffer[Int]): Int = {

var result = 0
val comb = xs ++ ys
  println(comb)
  val combLength = comb.length
  if (combLength == 0 ) throw new Error("Array out of bound")

  for (nums <- 0 until combLength)  {

    //println("xs(num) is :" + comb(nums))
     result ^= comb(nums)

    println("result value for  " + comb(nums) + "is" + result)
  }
  return result
}


find(ArrayBuffer(1,2,3,4), ArrayBuffer(1,3,4))