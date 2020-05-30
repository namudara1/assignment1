object sal extends App {
 
def wage (Whours:Int):Double= 150*Whours
def OT (othours:Int):Double= othours*75
def tax (i:Double):Double= i*0.1
def income(h1:Int,h2:Int):Double=wage(h1) + OT(h2)
def salary(a:Int,b:Int):Double=income(a,b)- tax(income(a,b))

println("Rs" +salary(40,20))

}