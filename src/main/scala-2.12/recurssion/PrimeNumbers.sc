

def primesUnder(n: Int): List[Int] = {
  require(n >= 2)

  def rec(i: Int, primes: List[Int]): List[Int] = {
    if (i >= n) primes
    else if (prime(i, primes)) rec(i + 1, i :: primes)
    else rec(i + 1, primes)
  }

  rec(2, List()).reverse
}

def prime(num: Int, factors: List[Int]): Boolean = factors.forall(num % _ != 0)


primesUnder(6)
