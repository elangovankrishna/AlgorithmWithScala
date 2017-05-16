/** We need to choose an pivot value from the given list and get the elements seperated into smaller than
  and greater than pivot and sort them calling recursively choosing a new pviot value.
  **/

def quickSort(xs: List[Int]): List[Int] = xs match {

  case Nil => xs
  case xs::Nil => List(xs)
  case pvt :: xs =>
    val (lesser, greater) = xs.partition(_ < pvt)
    quickSort(lesser) ::: (pvt :: quickSort(greater))

}

val testList = List(1, -4, 5, 7,2)
quickSort(testList)