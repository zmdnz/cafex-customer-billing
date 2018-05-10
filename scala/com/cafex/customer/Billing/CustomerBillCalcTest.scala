package com.cafex.customer.Billing

import com.cafex.customer.Billing.CustomerBillCalc
import org.junit.Test
import org.junit.Assert._

class CustomerBillCalcTest{    
    
  @Test
  def testTotalBillWithAllItems()
  {
    assertEquals(CustomerBillCalc.billCalculator(List("Coffee","Cola", "Cheese Sandwich", "Steak Sandwich")), 8.50) 
    
  }
  
  @Test
  def testTotalBillWithFewItems()
  {
    assertEquals(CustomerBillCalc.billCalculator(List("Coffee", "Cheese Sandwich")), 3.50) 
    
  } 
}