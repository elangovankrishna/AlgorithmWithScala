/**We can achieve this using different methods
  * 1. We are sort the list or strings and match on the length of the element if match its
  * Anagram else its not
  * 2. The imperative way of doing this would be by sorting and iterating over the elements
  * and match the I th element to see of they match else add one to the count at the end if
  * the count is greater than 1 then its not an Anagram else it is.
  * @return
  */

//def anagram(wrd1: String, wrd2: String): Boolean = {

  //var w1 = wrd1.replaceAll(" ", "").toLowerCase()
  //var w2 = wrd2.replaceAll(" ", "").toLowerCase()


  //if (w1.length() == w2.length()) true else false

def anagram(wd1: String, wd2: String): Boolean = {

  var wrd1 = wd1.replaceAll(" ", "").toLowerCase().sorted
  var wrd2 = wd2.replaceAll(" ", "").toLowerCase().sorted

  var res = false
  var cnt = 0
  if (wrd1.length() != wrd2.length()) res = false
  else {
    for (ltr <- 0 until wrd1.length())
      if (wrd1(ltr) == wrd2(ltr))
        res = true
      else
        cnt += 1

    if (cnt == 0) res = true else res = false
  }
  res
}


anagram("god", "dog")
anagram("clint eastwood", "oll west action")




