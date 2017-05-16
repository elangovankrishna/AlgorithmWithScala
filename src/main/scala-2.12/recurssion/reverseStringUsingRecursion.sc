

def reverse(xs: String): String = {

  if (xs.isEmpty) xs else xs.last + reverse(xs.init)

}

reverse("hello world")
reverse("123456789")