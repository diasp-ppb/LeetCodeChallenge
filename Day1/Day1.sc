object Solution {
  def singleNumber(nums: Array[Int]): Int = {
    var res: Int = 0
    for( num <- nums )
      res^=num
    res
  }
}

Solution.singleNumber(Array(2,2,1)) //1
Solution.singleNumber(Array(4,1,2,1,2)) //4
