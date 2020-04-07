object Solution {
  def countElements(arr: Array[Int]): Int = {
     val grouped: Map[Int,Array[Int]] = arr.groupBy(identity)

     grouped.map{
       case (n,array: Array[Int]) =>
         if(grouped.contains(n+1))
          array.length
         else
           0
     }.sum
  }
}

Solution.countElements(Array(1,2,3))
Solution.countElements(Array(1,1,3,3,5,5,7,7))
Solution.countElements(Array(1,3,2,3,5,0))
Solution.countElements(Array(1,1,2,2))

