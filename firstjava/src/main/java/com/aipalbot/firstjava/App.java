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
    
    	String[] itemNames= new String[5];  //0,1,2,3,4
    	int size = itemNames.length;
    	double[] itemPrices = new double[size]; 
    	int[] itemQuantities = new int[size];
    	double[] totalCostPerItems=new double[size];
    	
 	
    	
 		double totalAmount = 0.0; //accumulator
 		

 		
    	for(int i = 0; i < size; i++) {
    		int header = i+1;
    		System.out.println("***************** Item "+header+" **********************");
    		
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
    		
     		
    		
    		totalAmount +=totalCostPerItem;
    		
    	}
    	
    	
    	
 		System.out.print("ItemName \t |");
 		System.out.print("ItemPrice \t |");
 		System.out.print("ItemQuantity \t |");
 		System.out.println("TotalCost \t ");
 		//This is to only display the items in table
    	for(int i = 0; i < size; i++) {    		
    		System.out.print(itemNames[i] + " \t |");
     		System.out.print(itemPrices[i] +" \t |");
     		System.out.print(itemQuantities[i]+" \t |");
     		System.out.println(	totalCostPerItems[i] +" \t ");
    	}
    	
    	
    	
    	
    	 DecimalFormat dFormat = new DecimalFormat("####,###,###.00");
         String formatTotalAmount = "$" + dFormat.format(totalAmount);
         
    	System.out.println("Total Amount: " + formatTotalAmount);   	
    	
    	
    	String[] studentNames = new String[3];
    	studentNames[0]="June";
    	studentNames[1]="May";
    	studentNames[2]="Sept";
    	
    	for(int i=0; i<studentNames.length;i++) {
    		System.out.println("Student "+ (i+1) + " is " + studentNames[i]);
    	}
    	
    	System.out.println("***********************************************************");
//    	//int j=1;
//    	for(String student: studentNames) {
//    		System.out.println("Student "+ (j++) + " is " + student);
//    	}
//    	
    	
    	
    	int matRow=2;
    	int matCol=3;
    	
    	int[][] matA = new int[matRow][matCol];
    	
    	int size = matA.length;
    	System.out.println(size);
    	/*
    	 * |6 9 8|
    	 * |2 7 9|
    	 

    	for(int row=0; row<size; row++) {
    		System.out.println("Current row is " + row);
    		
    		for(int col=0; col < matCol; col++) {
    			// matA[row][col]
    			System.out.println("row="+row+" , col="+ col);
    			Scanner input = new Scanner(System.in);
    			System.out.println("Enter value for row "+ row + ", col " + col );
    			matA[row][col]=input.nextInt();
    		}    		
    	}
    	
    	
    	
    	for(int row=0; row<size; row++) {    		
    		System.out.print("|");
    		for(int col=0; col < matCol; col++) {
    			System.out.print(matA[row][col] + "\t");
    		}
    		System.out.println("|");
    	}
    		
    	//Sum all the numbers on each row
    	//Sum of row 0 = 23
    	//Sum of row 1 = 18
    	int sum=0;
    	for(int row=0; row<size; row++) {    	
    		int sumOfRow=1; //use 0 when summing and 1 when multiplying
    		for(int col=0; col < matCol; col++) {
    			sumOfRow*=matA[row][col]; // change * to +
    		}
    		System.out.println("Sum of row "+ row + " = " + sumOfRow);
    		sum+=sumOfRow;
    	}
    	System.out.println("Sum of all="+ sum);
    	*/
    	
    	/*
    	 * A student scored 70 in course101, 50 in course102, and 85 in course103
    	 * Credit hours for course101=3, course102=3, course103=4
    	 * Grading 
    	 * 0-39 = 1 point
    	 * 40-49 = 2 point
    	 * 50-59 = 3 point
    	 * 60-69 =4 point
    	 * 70-100=5 point
    	 * 2-D array contains rows represent courses and columns rep grading point and credit hrs
    	 * |5 3|
    	 * |3 3|
    	 * |5 4|
    	 * Calculate student GPA
    	 * Sum of all gradingPoint*creditHrs / sum of all creditHrs
    	 */
    	
    	int r =3;
    	int c=2;
    	int[][] arrayA = new int[r][c];
    	int sumOfAll =0;
    	int sumCrHr=0;
    	
    	//ENTER VALUES OF THE ARRAY
    	for(int i=0; i<r; i++) {
    		System.out.println("Current row is " + i);
    		
    		for(int j=0; j < c; j++) {   
    			System.out.println("row="+i+" , col="+ j);
    			Scanner input = new Scanner(System.in);
    			System.out.println("Enter value for row "+ i + ", col " + j );
    			arrayA[i][j]=input.nextInt();	  			
    		}    
    		
    	}
    	
    	
    	//calculate point * crhr
    	
    	for(int i=0; i<r; i++) {
    		int mult=1;
    		for(int j=0; j < c; j++) {  
    			
    			mult*=arrayA[i][j];  // mult = mult * arrayA[i][j]
    			//add all the values in second columns
    			if(j==1)
    				sumCrHr+=arrayA[i][j];
    			
    		} 
    		System.out.println("Row " + (i+1) + " = " + mult);
    		sumOfAll += mult;    		
    	}
    	
    	System.out.println("Sum of Point*CrdHrs = " + sumOfAll);
    	
    	System.out.println("Sum of CrdHrs = " + sumCrHr);
    	
    	double gpa = sumOfAll/sumCrHr;
    	
    	System.out.println(" (GPA) Sum of Point*CrdHrs / Sum of CrdHrs = " + gpa);
    	
    }
    
    
    
    
}
