object lal extends App {
  
  def Sum(n:Int,sum:Int=0):Int=
  {
    var sumV:Int=sum
    sumV = sumV + n
    if(n-1>=1)
    {
      Sum(n-1,sumV)
    }
    else
    {
      return sumV
    }
    
  }
  println(Sum(5))
  
}