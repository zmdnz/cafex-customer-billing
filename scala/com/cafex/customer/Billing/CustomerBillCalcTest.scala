package com.cafex.customer.Billing

import com.cafex.customer.Billing.CustomerBillCalc
import org.junit.Test
import org.junit.Assert._

class CustomerBillCalcTest{    
    
  @Test
  def testDrinksOnlyBillHasNoServiceCharge()
  {
    assertEquals(CustomerBillCalc.billCalculator(List("Coffee","Cola", "Cola")), 2.00)    
  }
  
  @Test
  def testColdFoodOnlyBillCharged10PercentServiceCharge()
  {
    assertEquals(CustomerBillCalc.billCalculator(List("Cheese Sandwich")), 2.75)  
  }
  
  @Test
  def testHotFoodOnlyBillCharged20PercentServiceCharge()
  {
    assertEquals(CustomerBillCalc.billCalculator(List("Steak Sandwich")), 5.40) 
  }   
   
  @Test
  def testHotFoodInclusionAdds20PercentServiceCharge()
  {
    assertEquals(CustomerBillCalc.billCalculator(List("Steak Sandwich","Coffee","Cola","Cola")), 7.80) 
  }
  
  @Test
  def testColdFoodAndDrinksCharged10Percent()
  {
    assertEquals(CustomerBillCalc.billCalculator(List("Cheese Sandwich", "Coffee")), 3.85) 
    
  }
  
  @Test
  def testColdFoodAndHotFoodWithoutDrinkCharged20Percent()
  {
    assertEquals(CustomerBillCalc.billCalculator(List("Cheese Sandwich", "Steak Sandwich")), 8.40)
  }
  
  @Test
  def testServiceCharegeAbobe20GBP()
  {
    assertEquals(CustomerBillCalc.billCalculator(List("Steak Sandwich","Steak Sandwich","Steak Sandwich","Steak Sandwich","Steak Sandwich","Steak Sandwich","Steak Sandwich","Steak Sandwich",
                                                       "Steak Sandwich","Steak Sandwich","Steak Sandwich","Steak Sandwich","Steak Sandwich","Steak Sandwich","Steak Sandwich","Steak Sandwich",
                                                       "Steak Sandwich","Steak Sandwich","Steak Sandwich","Steak Sandwich","Cheese Sandwich","Cheese Sandwich","Cheese Sandwich","Cheese Sandwich",
                                                       "Cheese Sandwich","Cheese Sandwich","Cheese Sandwich","Cheese Sandwich","Cheese Sandwich","Cheese Sandwich")), 135.00)
  }
}