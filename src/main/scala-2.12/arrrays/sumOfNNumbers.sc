/** This is the basic algorithamic question which is find the sum of n numbers.
  * 1. we are iteratively go over all the elements and sum them up (naive way)
  * 2. Using Recursion
  * 3. Using formula n*(n+1)/2
  *
  *
  * @param x
  * @return
  */

// one way of defining the sum of numbers

def sum1(x: Int): Int = {
  if(x == 0) x else x + sum1(x-1)}

sum1(10)

//Another way of defining the numbers will be

def sum2(x: Int): Int = (x*(x+1))/2

sum2(10)

//Big O constant

def func_const(list: List[Int]) = println(list(0))


val l1 = List(1, 2, 3,4)

