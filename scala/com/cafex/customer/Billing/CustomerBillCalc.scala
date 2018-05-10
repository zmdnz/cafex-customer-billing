package com.cafex.customer.Billing
import scala.math.BigDecimal

object CustomerBillCalc {  
  /* Menu item in cafeX */
  val cafex_menu = Map( "Cola"->0.50,
                        "Coffee"->1.00, 
                        "Cheese Sandwich"->2.50,
                        "Steak Sandwich"->4.50)
                         
  /** Calculates service charge and total bill
  * @param list of items customer purchased 
  * returns 2 digit decimal precision total bill
  * 
  */  
  def billCalculator(bill: List[String])={ 
    
    val total_bill = BigDecimal((bill map cafex_menu).sum).setScale(2) 
    total_bill     
  } 
}