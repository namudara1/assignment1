object lal extends App {
  
  fibseq(12)


def fib(n:Int):Int=
{
  if(n==0){return 0}
  else if(n==1){return 1}
  else
  {
    return fib(n-1)+ fib(n-2)
  }
}

def fibseq(i:Int):Any={
   
  if(i>0)
  {
    fibseq(i-1)
  }
     println( fib(i))
}
}
 