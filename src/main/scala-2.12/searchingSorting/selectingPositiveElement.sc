/** Given an list of integer filter out just the positive
  * elements from it, we are using pattern matching for this
  *
  * @param xs
  * @return
  */

def posElement(xs: List[Int]): List[Int] = xs match {
  case Nil => xs
  case (y::ys) => if(y > 0) y::posElement(ys)
                  else posElement(ys)
  }

posElement(List(3,5,-1,-4))