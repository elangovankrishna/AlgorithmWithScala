

def permutation(xs: List[Int]): List[List[Int]] = xs match {

  case Nil => List(Nil)
  case List(a) => List(xs)
  case _ =>


      (for (i <- xs.indices.toList) yield {


        println("currently i is :" + i)

        val (before, rest) = xs.splitAt(i)

        println("before: " + before + "rest: " + rest)

        val ielem = rest.head

        println(" ielem: " + ielem)
        println("before ++ rest.tail : " + (before ++ rest.tail))

        val subpermutation = permutation(before ++ rest.tail)
        println("subpermutation : " + subpermutation)
        subpermutation.map(ielem::_)
        //println("subpermutation : " + subpermutation)
      }).flatten
}

permutation(List(1))