package com.aipalbot.firstjava;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
	
	
	
    public static void main( String[] args )
    {
    	/*
    	//I am a programmer
    	
    	/* I believe I will be able to write you this Java code anyway and anyhow
    	Till I can write better, if you don't run, I won't run 
    	
    	
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
        
  
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for x: ");       
        int x = scanner.nextInt();
        System.out.println("The value of x is " + x);
        
        System.out.println("Enter value for y: ");       
        int y = scanner.nextInt();
        System.out.println("The value of y is " + y);
        
        //x^2 + 3x + 1 - 3y - 3x
        double xy  = Math.pow(x,2) + 3 * x + 1 - 3 * y - 3 * x;
        
        System.out.println("x^2 + 3x + 1 - 3y - 3x = " + xy);
        
        
        
        //2x+(y+3x+4y)-2x
         * 
         *       */
    	
        //As a user, I want to be able to see the total sum of items showing item names and prices
    	/*
    	ItemName	|ItemPrice	ItemQuantity	TotalCost
    	Dove		|	5.01		3			15.03
    	Detol		|	3.25		2			6.5
    	ToothPaste		4.3			8			34.4
    	Laptop			450.29		1			450.29
    	Monitor			120.23		1			120.23
    				626.45
    */
    	String[] itemNames= new String[5];  //0,1,2,3,4
    	int size = itemNames.length;
    	double[] itemPrices = new double[size]; 
    	int[] itemQuantities = new int[size];
    	double[] totalCostPerItems=new double[size];
    	
 	
    	
 		double totalAmount = 0.0; //accumulator
 		
 		System.out.print("ItemName \t |");
 		System.out.print("ItemPrice \t |");
 		System.out.print("ItemQuantity \t |");
 		System.out.println("TotalCost \t ");
 		
    	for(int i = 0; i < size; i++) {
    		Scanner input = new Scanner(System.in);
    		System.out.println("Enter Item Name: ");
    		String itemName = input.nextLine();
    		itemNames[i] = itemName;
    		
    		System.out.println("Enter Item Quantity: ");
    		int itemQuantity = input.nextInt();
    		itemQuantities[i] = itemQuantity;
    		
    		System.out.println("Enter Item Price: ");
    		double itemPrice = input.nextDouble();
    		itemPrices[i] = itemPrice;  		
    		
    		double totalCostPerItem =itemQuantity * itemPrice;
    		totalCostPerItems[i] = totalCostPerItem;
    		
    		/*
    		System.out.print(itemName + " \t |");
     		System.out.print(itemPrice +" \t |");
     		System.out.print(itemQuantity+" \t |");
     		System.out.println(totalCostPerItem+" \t ");
    		
     		*/
    		
    		totalAmount +=totalCostPerItem;
    		
    	}
    	
    	 DecimalFormat dFormat = new DecimalFormat("####,###,###.00");
         String formatTotalAmount = "$" + dFormat.format(totalAmount);
         
    	System.out.println("Total Amount: " + formatTotalAmount);
    	
    	
    	
    	
    	
    }
    
    
    
    
}
