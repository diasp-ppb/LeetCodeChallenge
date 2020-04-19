object Solution {
  def numIslands(grid: Array[Array[Char]]): Int = {
    if(grid.isEmpty) return 0

    var land = 0

    for(x <- grid.indices)
      for(y <- grid(x).indices)
      {
        if(grid(x)(y) == '1') {
          land += 1
          markLand(grid,x,y)
        }
      }

    land
  }

  def markLand(grid: Array[Array[Char]], x: Int, y: Int):Any = {
    if(grid.length <= x || grid(0).length <= y)
        None
    else if(grid(x)(y) == '0')
        None
    else
    {
      grid(x)(y) = '0'

      if(x+1 < grid.length && grid(x+1)(y) == '1')
        markLand(grid, x+1, y)
      if(x-1 >= 0 && grid(x-1)(y) == '1')
        markLand(grid, x-1, y)
      if(y+1 < grid(0).length && grid(x)(y+1) == '1')
        markLand(grid,x,y+1)
      if(y-1 >= 0 && grid(x)(y-1) == '1')
        markLand(grid,x,y-1)
    }
  }
}


Solution.numIslands(Array(Array('1','1')))