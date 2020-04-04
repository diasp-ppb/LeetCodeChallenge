object Solution {
  def maxSubArray(array: Array[Int]) = {
    var sum = 0
    var maxSum = Integer.MIN_VALUE

    for (num <- array) {
      sum += num

      if (num > sum) {
        sum = num
      }

      if (sum > maxSum) {
        maxSum = sum
      } else if (sum < 0) {
        sum = 0;
      }
    }
    maxSum
  }
}

Solution.maxSubArray(Array(-2,1,-3,4,-1,2,1,-5,4))