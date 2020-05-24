object Price extends App {
 
  def priceWithDiscountAndCost(bookAmount:Int) = {val a:Double =bookAmount*0.6*24.95
      var p=
      if(bookAmount >50)
      {
        3+ 0.75*(bookAmount-50)
           
      }
      else
      {
        3
      }
    printf(p+a  +"Rupees")
    }
  priceWithDiscountAndCost(60)
  
  

  
}