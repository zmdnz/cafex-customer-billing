package com.cafex.customer.Billing
import scala.math.BigDecimal

object CustomerBillCalc {  
  /* Menu item in cafeX */
  val cafex_menu = Map( "Cola"->0.50,
                        "Coffee"->1.00, 
                        "Cheese Sandwich"->2.50,
                        "Steak Sandwich"->4.50)
                         
 /* Grouped based on service charge category */                      
  val drinks = List("Cola","Cofee")
  val hotFood = List("Steak Sandwich")
  val coldFood = List("Cheese Sandwich")  
  
  /** Calculates service charge and total bill
  * @param list of items customer purchased 
  * returns 2 digit decimal precision total bill
  * 
  */  
  def billCalculator(bill: List[String])={ 
    var service_charge = 0.00   
    val total_without_service_charge = (bill map cafex_menu).sum   
    if (bill.exists{hotFood.contains}) 
    {
      service_charge = (total_without_service_charge/100)*20 
      if (service_charge > 20.00) service_charge = 20.00       
    }
    else if (bill.exists{coldFood.contains})  
    {
      service_charge = (total_without_service_charge/100)*10 
    }  
    val total_bill = BigDecimal(total_without_service_charge + service_charge).setScale(2)    
    total_bill     
  } 
}