object lal extends App {
  
println(addEven(11))
  
def addEven(n:Int):Int={
  
  if(n==0){return 0}
  else if(n%2==0)
  {
    return n-2 + addEven(n-2)
  }
  else
  {
    return n-1 + addEven(n-1)
  }
}
  
}