
object Solution {
  def checkValidString(s: String): Boolean = {
    var maxOpenLeft , minOpenLeft = 0;
    for(c <- s){
      if(c == '(') minOpenLeft+=1 else minOpenLeft-=1
      if(c != ')') maxOpenLeft+=1 else maxOpenLeft-=1
      /// cant close ')'
      if(maxOpenLeft < 0) return false
      //  for the empty '*'
      minOpenLeft = Math.max(0, minOpenLeft);
    }

    minOpenLeft == 0;
  }
}
//True
Solution.checkValidString("(*))")
Solution.checkValidString("()")
Solution.checkValidString("(*)")
Solution.checkValidString("(*()")
Solution.checkValidString("(((******))")

//false
Solution.checkValidString("(")
Solution.checkValidString("*()(())*()(()()((()(()()*)(*(())((((((((()*)(()(*)")
