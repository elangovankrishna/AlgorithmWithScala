def shellSort(xs: Array[Int]) = {
  var gap = xs.length/2
  println("gap is : "+ gap)
  while(gap >=1) {
    for (i <- gap until xs.length) {
      //println("value of i : " + i)
      var j = i - gap
      //println("j value here is :" + j)
      var tmp = xs(i)
      //println("tmp here is : " + xs(i))

      while (j >= 0 && tmp < xs(j)) {
        xs(j + gap) = xs(j)
        j -= gap
      }
      xs(j + gap) = tmp
    }
    gap = (gap/2.2).round.toInt
    //println("gap is : "+ gap)
  }
}


val lst = Array(4,7,2,9,3,8,1,5)
shellSort(lst)
println(lst.mkString(","))