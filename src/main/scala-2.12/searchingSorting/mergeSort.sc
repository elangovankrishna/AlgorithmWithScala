/** This method is to divide all the elements into single element and merge them into one
  while making sure the merging gets us sorted list
  **/

def mergeSort(xs: List[Int]): List[Int]  = {

  var mid = xs.length/2
  if (mid == 0) xs
  else {
    def merge(xs: List[Int], ys: List[Int]): List[Int] = (xs, ys) match {

      case (Nil, ys) => ys
      case (xs, Nil) => xs
      case (x::xs1, y::ys1) => {
        if(x < y) x::merge(xs1,ys)
        else y::merge(xs, ys1)
      }
    }

    val (fst, snd) = xs.splitAt(xs.length/2)
    merge(mergeSort(fst), mergeSort(snd))
  }

}

val testList = List(1, -4, 5, 7,2)
mergeSort(testList)