

/** Sentence Reversal which should take care of all the trailing
  * and leading white spaces
  *
  * Example "
  *   */

def reverse(arr: Array[Char], start: Int, end: Int) = {
  if (end > start) {

    (0 to (end - start)/2) foreach { i =>
      val iStart = i + start
      println("istart ele: " + arr(iStart))
      val iEnd = end -i
      println("iend ele: "  + arr(iEnd))
      val b = arr(iStart)

      arr(iStart) = arr(iEnd)
      arr(iEnd) = b
    }
  }
}

/*
"I love you" becomes "you love I"
Preserves whitespaces
Any non whitespace is considered part of the word -naive-
*/
def reverseWordsOrderInPlace(phrase: String) = {
  val arr = phrase.toCharArray
  val len = phrase.length - 1

  // Start by reversing all the chars in the string
  reverse(arr, 0, len)

  // A word start whenever there is no word already started and when the char is not a whitespace

  var startWordIndex: Option[Int] = None

  (0 to len) foreach { i =>
    if (startWordIndex.isDefined) {
      // Ending phrase or new space after word
      if (i == len || arr(i) == ' ') {
        val endIndex = if (i == len && arr(i) != ' ') i else i - 1

        println("word: " + arr.mkString + "startwordIndex : " + startWordIndex.get + "endIndex : " + endIndex)
        // Rereverse the word only
        reverse(arr, startWordIndex.get, endIndex)
        // We finished with this word, now let's look for the next one
        startWordIndex = None
      }
    } else if (arr(i) != ' ') {
      /*First word char*/
      startWordIndex = Some(i)
    }
  }
  arr.mkString.trim
}

reverseWordsOrderInPlace("this is")
//reverseWordsOrderInPlace("this is captain barnacles speaking     ")

