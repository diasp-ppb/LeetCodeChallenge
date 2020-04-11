object Solution {
  def backspaceCompare(S: String, T: String): Boolean = {
    var i = S.length - 1
    var j = T.length - 1

    while ((i >= 0 || j >= 0)) {
      val s1 = findNextValid(S, i)
      val t1 = findNextValid(T, j)

      (s1, t1) match {
        case (Some(ss1), Some(tt1)) if ss1._2 == tt1._2 => {
          i = ss1._1 - 1
          j = tt1._1 - 1
        }
        case (None, None) => {
          i = -1
          j = -1
        }
        case _ => {
          return false
        }
      }
    }
    return true
  }

  def findNextValid(s: String, i: Int): Option[(Int, Char)] = {
    var count = 0
    var index = i
    var running = true
    while (index >= 0 && running) {
      if (s.charAt(index) == '#') count = count + 1
      else count = count - 1

      if (count < 0) running = false
      else index = index - 1
    }

    if (index < 0) None
    else Some((index, s.charAt(index)))
  }
}

Solution.backspaceCompare("ab#c","ad#c")
Solution.backspaceCompare("ab##","c#d#")
Solution.backspaceCompare("a##c","#a#c")
Solution.backspaceCompare("a##c","b")

Solution.backspaceCompare("xywrrmp","xywrrmu#p")


/*

object Solution {
  def backspaceCompare(S: String, T: String): Boolean = {
     build(S).equals(build(T));
  }

   def build(S:String): String = {
     import scala.collection.mutable

     val ans = mutable.Stack[Char]()
    S.foreach( c => {
      if (c != '#')
        ans.push(c);
      else if (ans.nonEmpty)
        ans.pop();
    })
    ans.toString()
  }
}

Solution.backspaceCompare("ab#c","ad#c")
Solution.backspaceCompare("ab##","c#d#")
Solution.backspaceCompare("a##c","#a#c")
Solution.backspaceCompare("a##c","b")

Solution.backspaceCompare("xywrrmp","xywrrmu#p")

 */
