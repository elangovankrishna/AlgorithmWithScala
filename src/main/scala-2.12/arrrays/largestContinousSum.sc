

/** We will use function call for this problem
  * The logic here is to keep the maximum sum until that element in a variable and swap it with
  * calculated current sum of element to see if that is greater than the maximum value till then
  * For all positive values this is just an simple addition but this will get tricky once we have
  * Negative values in the list of elements.
  *   */

def largestContSum(xs: Array[Int]): Int = {

  if (xs.isEmpty) throw new Error("Array List is Empty")

  println("First element in the Array: " + xs.head)

  println("Last element in the Array: " + xs.last)

  var current_sum = xs(0)
  var max_sum = xs(0)

  for (elem <- 1 until xs.length) {

    current_sum = math.max(current_sum + xs(elem), xs(elem))
    println("current_sum : " + current_sum)

    max_sum = math.max(max_sum, current_sum)
    println("max_sum : " + max_sum)
  }
  return max_sum
}


//largestContSum(Array(1,2,-1,3,4,10,10,-10,-1))

largestContSum(Array(1,2,-1,3,4,-1))