object lal extends App {
  
  println(isEven(8));
  println(isEven(11));
  println(isOdd(13));
  
  
def isEven(n:Int):Boolean=n match{
  
  case 0=> true
  case _=>isOdd(n-1)
}

def isOdd(n:Int):Boolean= !(isEven(n))
  
}