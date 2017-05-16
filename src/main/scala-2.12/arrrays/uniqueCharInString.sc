import scala.collection.mutable.ArrayBuffer


//println("s(i) is: " + s(i) + " and s(i+1) : " + s(i+1))

def unq(s: String): Boolean = {
  val arr = s.toCharArray
  //val len = s.length
  //println(len)
  val seen = ArrayBuffer[Char]()
  //val seen1 = ListBuffer
  var bol = false

  //var sb = new StringBuilder()
  for (i <- 0 until arr.length) {

    println("seen contains : " + seen)
    if (seen contains arr(i))
      bol = false
    else {
      seen.append(arr(i))
      bol = true
    }
  }
  return bol
}

unq("abcdaa")