object Solution {

  @scala.annotation.tailrec
  def isHappy(n: Int, sequence: List[Int] = List()): Boolean = {
    getSumSquare(n) match {
      case 1 => true
      case n if sequence.contains(n) => false
      case n=> isHappy(n, n +: sequence)
    }
  }

  def getSumSquare(n: Int):Int = n match {
    case 0 => 0
    case _ =>
      val c = n % 10
      c * c + getSumSquare(n / 10)
  }
}

Solution.isHappy(19)