import scala.collection.mutable.ArrayBuffer

object Solution {
  def productExceptSelf(nums: Array[Int]): Array[Int] = {

    val n = nums.length

    val output :Array[Int] = Array.fill(n)(1)

    println(output.mkString("|"))

    for( i <- 1 until n by 1)
      {
        output(i) = nums(i-1)*output(i-1)
      }

    println(output.mkString("|"))
    var temp = 1

    for( j <- n-1 to 0 by -1)
      {
        output(j) = output(j)*temp
        temp =  temp * nums(j)
      }
    println(output.mkString("|"))

    output
  }
}

Solution.productExceptSelf(Array(1,2,3,4))