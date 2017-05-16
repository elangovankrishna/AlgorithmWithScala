

/** Given a string in the form 'AAAABBBBCCCCCDDEEEE' compress it
  * to become 'A4B4C5D2E4'. For this problem, you can falsely
  * "compress" strings of single or double letters.
  * For instance, it is okay for 'AAB' to return 'A2B1' even though
  * this technically takes more space.
  * The function should also be case sensitive,
  * so that a string 'AAAaaa' returns 'A3a3'.
  *
  * RUN LENGTH COMPRESSION ALGORITHM
  *
  * */

def compress(s: String)  = {

  val arr = s
  val len = arr.length

  if (len == 0) throw new Error("Array Out of bound")

  var cnt = 1
  var i = 1
  var str = new StringBuffer()

  println(len)

  if (len == 1) {
    str.append(arr).append("1")

  }

  if (len > 1) {

    while (i < len) {

      if (arr(i) == arr(i - 1)) {
        cnt += 1
      }
      else {
        str = str.append(arr(i - 1)).append(cnt.toString)
        cnt = 1
      }
      i += 1

    }
    str = str.append(arr(i - 1)).append(cnt.toString)
  }
  str.toString
}
compress("AAABBBBaaaa")