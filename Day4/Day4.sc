object Solution {
  def moveZeroes(nums: Array[Int]): Array[Int] = {
    for (i <- 0 until nums.length - 1; j <- 0 until nums.length - 1 - i) {
      if (nums(j) == 0) {
        val temp = nums(j)
        val k = j+1
        nums(j) = nums(k)
        nums(k) = temp
      }
    }
    nums
  }
}

Solution.moveZeroes(Array(0,1,0,3,12))
Solution.moveZeroes(Array(0,1,0,0,0,0,3,12))

