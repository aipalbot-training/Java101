package com.aipalbot.firstjava;

import java.text.DecimalFormat;

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
    	
    	if(areYouComing) System.out.println("I am aware");
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
        
        System.out.println("*********************************************");
      //Assignment
      /* 
       * Calculate the total price of 8 items at $3 each and subtract the cost of 2 items from the total price, 
       * if total price is more than $20
       * Display the amount to be paid after discount
       */
    	
        
        //ASSUME THAT WE RECEIVE THE QUANTITY AND PRICE FROM A UI SCREEN
        String quantityBox = "30000";
        String pricePerItemBox = "8667.55";
        double totalPriceFromBox;
        
        String totalPriceString = quantityBox + pricePerItemBox;
        
        System.out.println("Concatenation of String values "+ totalPriceString);
        //totalPriceFromBox = quantityBox + pricePerItemBox;
        
        //Casting is the same thing as converting types from one type to another
        int quantityOfItem =Integer.parseInt(quantityBox);
        double pricePerItem = Double.parseDouble(pricePerItemBox);
        
        totalPriceFromBox =quantityOfItem * pricePerItem;
        System.out.println("Total price of items "+ totalPriceFromBox);
        
        DecimalFormat dFormat = new DecimalFormat("####,###,###.00");
       String totalAmount = "$" + dFormat.format(totalPriceFromBox);
        
        
        System.out.println("Checkout amount: "+totalAmount);
        
        
        
        
        
        
    }
    
    
    
    
}
