class MinStack() {

  /** initialize your data structure here. */

  var stack = List[(Int,Int)]()

  def push(x: Int) = {
    if(stack.nonEmpty)
      if(stack.head._2 > x) {
        stack = (x, x) :: stack
      }
      else {
        stack = (x,stack.head._2) :: stack
      }
  else
  stack = (x,x) :: stack

}

def pop() {
  stack = stack.drop(1)
}

def top(): Int = {
  if(stack.nonEmpty)
    stack.head._1
  else
    java.lang.Integer.valueOf(null)
}

def getMin(): Int = {
  if(stack.nonEmpty)
    stack.head._2
  else
    java.lang.Integer.valueOf(null)
}

}



val minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();
minStack.pop();
minStack.top();
minStack.getMin();