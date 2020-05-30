object lal extends App {
  
  def prime(n:Int, i:Int=2):Boolean=  {
  
    if (n <= 2) 
    {
      if(n==1){return false}
      else {return true}
    }
     if (n % i == 0) 
    {
      return false; 
    }
    if (i * i > n) 
    {
       return true; 
    }
     return prime(n, i + 1); 
       
  }
  
  println(prime(5))
  println(prime(8))
  
 
}