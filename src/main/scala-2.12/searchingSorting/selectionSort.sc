/** this sort we take the first value and call it min or max and look at
  * other elements in the array and see if we have other min value if we
  * do then we swap it with that element else leave it there
  * So the swap operation will happen outside the forloop unlike Bubble sort
  * complexity O(n2)
  * https://www.youtube.com/watch?v=5MJgbb3bQ54
  */

def minSelectionSort(xs: Array[Int]) = {
  for (i <- 0 until xs.length -1){
    var min = i
    for (j <- i + 1  until xs.length) {
      if(xs(j) < xs(min)) min = j
    }
    val tmp = xs(i)
    xs(i) = xs(min)
    xs(min) = tmp
    println(xs.mkString)
  }
}

val lst = Array(6,3,1,7,2)
minSelectionSort(lst)
println(lst.mkString(","))