


/**
// Recursive call method for coin change problem
   def countChange(amount: Int, coins:List[Int]): Int = {
 if (amount == 0) 1

 else if (amount > 0 && coins.nonEmpty) {
      //println("amt - coins.head : " + (amount-coins.head) + " coins: " + coins)
      //println("amt : " + amount + " coins.tail: " + coins.tail)
   countChange(amount - coins.head, coins) + countChange(amount, coins.tail)

 }
  else
   0
}



 countChange(6, List(1,2))



 // recurrsive Method again in different way
def minCountChange(amount: Int, coins: List[Int]): Int = {

 var prev_min = amount
  var min_coins = 0

 if (amount < 0 ) 0
  else if (amount == 0) 1
  else {
    //iterating over each coin and "i" will be the value of the coin so for the first time
    //it will be 1 and until it changes to another coin
    coins foreach(i =>
     if (i <= amount) {
        min_coins = (1 + minCountChange(amount - i, coins))
        //println(min_coins)
        if (min_coins < prev_min) min_coins else prev_min
      }
    )

 }
  return min_coins
  }


 minCountChange(74, List(1,5,15,25))

  **/

//Dp method for coin change

def coinChangeDp(amount: Int, coins: List[Int]): Int = {

  //var results = ListBuffer[Int]
  val calculatedValue = Array.fill(amount + 1)(0)
  //var calculatedValue = ArrayBuffer[Int]
  var prev_min = amount
  var num_coins = 0
  //println("value of amount: " + amount)

  if (amount == 0) {
    return 1
  }
  if (amount < 0) {
    return 0
  }
  else
  if (coins.contains(amount)) {
    calculatedValue(amount) = 1
    return 1
  }
  else if (calculatedValue.contains(amount)) {
    return calculatedValue(amount)
  }
  else {
    for (amt <- 1 to amount) {
      coins foreach (coin =>
        if (coin <= amt && amt > 0) {
          //println("Value of i : " + i)
          //println("value of coin : " + coin)
          if (calculatedValue.contains(amt)) num_coins = calculatedValue(amt) + coinChangeDp(amt - coin, coins)
          else num_coins = 1 + coinChangeDp(amt - coin, coins)
          if (num_coins < prev_min) {
            prev_min = num_coins
          }
        }
        )
      calculatedValue(amt) = num_coins

    }
    return num_coins
  }
}


coinChangeDp(63, List(1,5,15,25))




