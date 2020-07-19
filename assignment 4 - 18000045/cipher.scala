object caesarcipher extends App{
  val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  
  val encrypt=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
  val decrypt=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key+a.size)%a.size)

  val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))

  val ct=cipher(encrypt,"abcde",6,alphabet)
  val cp=cipher(decrypt,"rs",2,alphabet)
  println(ct)
  println(cp)
}