import scala.collection.immutable.Stack

/** This is to check your knowledge on Stack as we can read in data into stack
  and pop them to match the non opening paranthesis aganist the poped value
  if that dosent match then its not balanced else it is
  **/

def parenBalance(str: String): Boolean = {

  val bol: Boolean = false
  if (str.length%2 != 0) false
  else {

    val openings = Set("(","[","{")

    var tmpstk = Stack[String]()

    for (i <- 0 until str.length) {

      if(openings contains (str(i).toString)) tmpstk.push(str(i).toString)
      else
        if(tmpstk.isEmpty) false
        else {
        val stkelem = tmpstk.pop
        if (str(i) != stkelem) false else true

      }
    }
  }
  return bol
}

parenBalance("{()}")