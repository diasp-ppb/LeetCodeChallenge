import scala.collection.mutable

object Solution {
  def findMaxLength(nums: Array[Int]): Int = {

     var count = 0
    nums.map({
      case 0 =>
        count -= 1
        count
      case 1 =>
        count += 1
        count
    })
      .zipWithIndex
      .groupBy(_._1)
      .values
      .foldLeft(2){
        (res:Int, values: Array[(Int,Int)] ) => {
          val sorted = values.map(_._2).sorted
          val iterationRes = sorted(sorted.length-1)-sorted(0)

          if(res < iterationRes)
            iterationRes + res
          else
            res
        }
      }
  }
}

Solution.findMaxLength(Array(0,1))
Solution.findMaxLength(Array(0,1,0,1))
Solution.findMaxLength(Array(0,1,0,1,1)) //2

/*
object Solution {
  import scala.collection.mutable

  def findMaxLength(nums: Array[Int]): Int = {


    val counts: mutable.HashMap[Int,Int] = mutable.HashMap((0,-1))

    var maxLength, count = 0

    for( (num:Int,i) <- nums.zipWithIndex)
    {
      if(num == 0) {
        count -= 1
      }
      else {
        count +=1
      }
      if(counts.contains(count)) {
        maxLength = Math.max(maxLength, i - counts.getOrElse(count,0))
      }
      else {
        counts.put(count, i)
      }
    }
    maxLength
  }
}
*/




