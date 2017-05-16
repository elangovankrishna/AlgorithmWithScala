/** Fibonacci series is 0 1 1 2 3 5 (addition of previous two numbers)
  *
  */


// recursively doing Fibnoccai series

  def fibRec(n: Int): Int = {
    if (n == 0 || n == 1) n else fibRec(n-1) + fibRec(n-2)
  }

fibRec(6)


// Iteratively doing Fib series

def fibItr(n: Int): Int = {

  var a = 0
  var b = 1
  var i = 0
  println(a)

  while (i < n) {
    val c = a + b
    a = b
    b = c
    println(a)
    i += 1
      }
return a
}

fibItr(6)

//Tail recursion

