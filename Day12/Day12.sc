object Solution {
  def lastStoneWeight(stones: Array[Int]): Int = {
   var sorted = stones.sortWith(_ < _)

    while (sorted.length > 1)
      {
        val stoneY = sorted(sorted.length-1) - sorted(sorted.length-2)
        sorted = sorted.dropRight(2)
        if(stoneY > 0)
            sorted = (sorted :+ stoneY).sortWith(_ < _)
      }

    if(sorted.length == 1)
      sorted(0)
    else
      0
  }
}



Solution.lastStoneWeight(Array(2,7,4,1,8,1)) //1