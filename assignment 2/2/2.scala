object film extends App {
  

def attendes(tprice:Int)=120 + (15-tprice)/5*20

def revenue(tprice:Int)=attendes(tprice)*tprice

def cost(tprice:Int)=3*attendes(tprice) + 500

def profit(tprice:Int)=revenue(tprice)-cost(tprice)

println("Profit(Ticket price 5)= "+ profit(5)+" Rs")
println("Profit(Ticket price 10)= "+ profit(10)+" Rs")
println("Profit(Ticket price 15)= "+ profit(15)+" Rs")
println("Profit(Ticket price 20)= "+ profit(20)+" Rs")
println("Profit(Ticket price 25)= "+ profit(25)+" Rs")
println("Profit(Ticket price 30)= "+ profit(30)+" Rs")
}
  