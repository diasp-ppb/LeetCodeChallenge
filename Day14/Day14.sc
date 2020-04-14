object Solution {
  def stringShift(s: String, shift: Array[Array[Int]]): String = {
    shift.map(move).sum match {
      case n if n > 0 => {
        rotateLeft(s, s.length - n % s.length)
      }
      case n if n < 0 => {
        println(n)
        rotateLeft(s,-n % s.length)
      }
      case _ => s
    }
  }

  def move(move: Array[Int]): Int = {
    if(move(0) == 0)
      -move(1)
    else
      move(1)
  }

  def rotateLeft(str: String, moves:Int): String = {

    str.substring(moves) + str.substring(0,moves)
  }

}

Solution.stringShift("abcdefg", Array(Array(1,1),Array(1,1),Array(0,2),Array(1,3)))