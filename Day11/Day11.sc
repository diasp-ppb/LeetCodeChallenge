class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null
}

object Solution {
  def diameterOfBinaryTree(root: TreeNode): Int = {
    if(root == null)
      0
    else
      {
        var left =  diameterOfBinaryTreeLoop(root.left)
        var right = diameterOfBinaryTreeLoop(root.right)

        Math.max(Math.max(left._1,right._1),Math.max(left._1+right._1,Math.max(left._2,right._2)))
      }
  }

  def diameterOfBinaryTreeLoop(root: TreeNode): (Int,Int) = {
    if (root == null)
      return (0,0)

    var left = (0,0)
    var right = (0,0)

    if (root == null)
       (0,0)
    else {
      if(root.left != null)
        left = diameterOfBinaryTreeLoop(root.left)

      if(root.right != null)
        right = diameterOfBinaryTreeLoop(root.right)

      (Math.max(left._1,right._1)+1,Math.max(left._1+right._1,Math.max(left._2,right._2)))
    }
  }
}