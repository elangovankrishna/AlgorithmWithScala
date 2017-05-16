/** Insertion sort sorts leaves the first element of the list
  * and takes the next element and checks to see if its smaller
  * or greater than element in the list (first element) and puts
  * it in the list on the proper position, similarly other elements
  * are checked aganist the element in the sorted list to place
  * them in the sorted list.
  * @param xs
  */

def insertionSort(xs: Array[Int]) = {
  for (i<- 1 until xs.length) {
    var j = i -1
    var tmp = xs(i)

    while (j>=0 && tmp < xs(j)){
      xs(j+1) = xs(j)
      j -= 1

    }
    xs(j+1) = tmp
    //println(xs.mkString(","))
    println("xs(j+1) : " + xs(j+1))
  }
}

val lst = Array(6,3,1,7,2)
insertionSort(lst)
println(lst.mkString(","))

