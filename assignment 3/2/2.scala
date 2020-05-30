object lal extends App {
  
  seqPrime(14)
  
 def seqPrime(n:Int,a:Int=2):Unit=
 {
   if(n>=2 && a<=n)
   {
     if(prime(a)) {println(a)}
     seqPrime(n,a+1)
   }
   
 }
 
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
  
}