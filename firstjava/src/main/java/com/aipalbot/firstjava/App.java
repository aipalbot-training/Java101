package com.aipalbot.firstjava;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
	
    public static void main( String[] args )
    {
    	//I am a programmer
    	
    	/* I believe I will be able to write you this Java code anyway and anyhow
    	Till I can write better, if you don't run, I won't run 
    	*/
    	boolean areYouComing = true;
    	boolean imNotComing = false;
    	
    	//Calculate the total price of 3 items at $7 each and subtract the cost of 1 item from the total price, 
    	//if total price is more than $17
    	
    	
    	
    	int totalPrice;
    	int costPerItem = 7;
    	int quantity =3;
    	int discountCheck = 17;
    	
    	totalPrice =  quantity * costPerItem;  // a + b, +, -, *, /, %, BODMAS (a + b) * c, a+b*c
    	
    	System.out.println("Total Price before discount:" + totalPrice );   
    	
    	if( totalPrice > discountCheck)
    	{   		
    		// copy the value of totalPrice=21 into newTotalPrice=21
    		int newTotalPrice = totalPrice; 
    		totalPrice = totalPrice - costPerItem; //  a = a + c;   a += c;       
    		
    		//int totalPriceAfterDiscount = totalPrice - costPerItem;
    		
    		newTotalPrice -= costPerItem;
    		
    	    System.out.println("Total Price after discount using -= :" + newTotalPrice );   //concatenation
    	}
    	
    	
    	
        System.out.println("Total price after discount :" + totalPrice );   //concatenation means join
        
        System.out.println(quantity * costPerItem);
        
      //Assignment
      /* 
       * Calculate the total price of 8 items at $3 each and subtract the cost of 2 items from the total price, 
       * if total price is more than $20
       * Display the amount to be paid after discount
       */
    	
        
    }
    
    
    
    
}
