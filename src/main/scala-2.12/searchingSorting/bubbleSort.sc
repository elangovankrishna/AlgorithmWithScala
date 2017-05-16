/** We are calling for loop on length -1 and another loop on the array
  * which is J which would traverse on length-1-I which will make sure it
  * only goes till the very last item for that unsorted array
  * https://www.youtube.com/watch?v=eeNm9YSYlLE 15 sec.
  */


def bubbleSort(xs: Array[Int]) = {

  for (i <- 0 until xs.length -1 ){
    for (j<- 0 until xs.length-1-i){
      if(xs(j) > xs(j+1)){
        val tmp = xs(j)
        xs(j) = xs(j+1)
        xs(j+1) = tmp
      }

    }
  }
}

val lst = Array(6,3,1,7,2)
bubbleSort(lst)
println(lst.mkString(","))

