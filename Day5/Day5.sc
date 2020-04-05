object Solution {
  def maxProfit(prices: Array[Int]): Int = {
    if(prices.length  < 2)
       0
    else
      {
        var buy: Int = prices.head
        var profit: Int = 0

        for(last <- prices) {
          if(last > buy)
            profit += last - buy
          buy = last
        }
        profit
      }
  }
}

Solution.maxProfit(Array(7,1,5,3,6,4))
Solution.maxProfit(Array(1,2,3,4,5))
Solution.maxProfit(Array(7,6,4,3,1))
