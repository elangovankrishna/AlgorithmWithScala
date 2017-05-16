/** divide and conquere is the idea with binary array
  **/


// Its a recursion method of doing an Binay search and the list must by
// ordered
def binarySearch(xs: List[Int], elem: Int): AnyVal = {


  if (xs.isEmpty) false
  else {

    val mid = xs.length / 2
    var (before, after) = xs.splitAt(mid)
    if (elem == xs(mid)) true
    else {
      if (elem < xs(mid)) binarySearch(before, elem)
      else {
        if (elem > xs(mid)) binarySearch(after, elem)
      }
    }
  }

  }

binarySearch(List(), 5)


//Lets do it using loops to do an Binary search

/**
def binarySearchFor(xs: List[Int], elem: Int): Boolean ={

  var first = 0
  var last = xs.length-1
  var found = false

  while(first <= last && !found) {
    var mid = xs.length/2
    if(xs(mid) == elem) found = true
    else {
      if (xs(mid) < elem) first = mid -1
      else if (xs(mid) > elem) last = mid -1
    }
  }
  return found
}

binarySearchFor(List(1,2,3,4,5), 2)