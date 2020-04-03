object Solution {
  def singleNumber(nums: Array[Int]): Int = {
    nums.foldLeft(0)(_ ^ _)
  }
}

Solution.singleNumber(Array(2,2,1)) //1
Solution.singleNumber(Array(4,1,2,1,2)) //4
