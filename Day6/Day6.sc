object Solution {
  def groupAnagrams(strs: Array[String]): List[List[String]] = {
    strs.toList.groupBy(orderedWord).values.toList.sortBy(-_.length)
  }

  def orderedWord(t:String): String = {
    t.toCharArray.sortBy(identity).mkString.toString
  }
}

Solution.groupAnagrams(Array("eat", "tea", "tan", "ate", "nat", "bat")).foreach(System.out.println)
Solution.groupAnagrams(Array("cab","tin","pew","duh","may","ill","buy","bar","max","doc")).foreach(System.out.println)

