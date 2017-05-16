/** Sequential search of an element present in a list, so definition CONTAINS
  should return true or false depending on the element being present or  not
  **/


def contains(xs: List[Int], elem: Int): Boolean = {

  var found = false
  //the list must by ordered for this search to work!
  var stop = false
/**  xs foreach(i =>

    if((i == elem) && stop) found = true
    else if (i > elem) stop = true
    else println(stop)
    )
  return found
}
**/

  for(i <- 0 until xs.length) {
      if(xs(i) == elem) found = true
      else if (xs(i) > elem) stop = true

  }
  return found
}

contains(List(1,2,3,4,5,6,8,10), 11)