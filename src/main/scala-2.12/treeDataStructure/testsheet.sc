

val ratings = Map("country" -> List("us", "uk"),
                  "agerange" -> List("0-9","10-20","21-30"))



/**var valsList = List[String]
ratings.foreach(kv =>

    for (vl <- 0 until kv._2.length) {

      valsList :: kv._2
    }
   )

println(valsList) **/

val movies = Map("Lady in the Water"-> 3.0,
                  "Snakes on a Plane"-> 4.0,
                  "You, Me and Dupree"-> 3.5)


movies.values.foreach((values) => println(values))

/**
def missingElem(xs: Array[Int], ys: Array[Int]): Int = {

  var dict = scala.collection.mutable.HashMap[Int,Int]()

  for (i <- 0 until ys.length) {

    if (dict.keys == ys(i))
        dict(ys(i)) += 1
    else
        dict += ys(i) -> 1
  }

  for (j <- 0 until xs.length) {

    if (dict(xs(j) == 0)

    if (dict.keys == xs(j))

  }
}

  **/
var test = List(8,10,5,7,2,1,5,4,10,10)

val (fst, snd) = test.partition(_<2)

var len = test.length
var nthIndex = len - 7

test(nthIndex)

val ran = scala.util.Random

ran.nextInt(len)
ran.nextInt(len)