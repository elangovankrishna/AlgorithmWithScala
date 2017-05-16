/** The important concept of this solution is to use ArrayBuffer data structure so that
  * we can add elements to the Array and these are mutable data structure
  * The logic is to define an target element we are looking for and search through the ArrayBuffer
  * to find it else add to it and continue on till the end of the Array to get all the list of
  * elements that add up to element K which was given in the input
  */

import scala.collection.mutable.ArrayBuffer

def pair_sum(xs: Array[Int], k: Int): ArrayBuffer[(Int,Int)]={

  if (xs.length < 2) println("Element list contains less than 2 elements")



    var seen = ArrayBuffer[Int]()
    var output = ArrayBuffer[(Int, Int)]()

    for (num <- 0 until xs.length) {

      println("xs(current value):" + xs(num))
      var target = k - xs(num)
      println("target value we are looking for: " + target)
      println("seen contains:" + seen)

      if (seen contains (target)) {
        output += ( (xs(num), target) )

        println("Output values is: " + output)
      }
      else {
        seen += xs(num)
        println("now seen contains:" + seen)
      }
    }

  //return output.length
  return output
}

//pair_sum(ArrayBuffer(1,3,2,2),4)

pair_sum(Array(1,9,2,8,3,7,4,6,5,5,13,14,11,13,-1),10)