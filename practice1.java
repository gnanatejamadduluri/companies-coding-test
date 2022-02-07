package gnanaPractice;
import java.io.*; 
import java.lang.*;
import java.util.Scanner;
public class practice1 
{
/* 					TCS CODING QUESTION
 --->  CODE TO TAKE NUMBER OF ELEMENTS AND THE ELEMENTS BASED ON NUMBER GIVEN; PRINT THE HIGHEST NUMBERS OF REQUIRED LENGHT MUST BE PRINTED 
 QUESTION:	CONSIDER A SUPER MARKET ENTRY SYSTEM, 
 			WHERE "n" SHOULD TAKE THE NUMBER OF ITEMS AND THEN "B" MUST TAKE THE INPUT OF THE PRICE OF THE ITEMS
 			THEN ITEMS AND PRINT THE TOP 3 PRICES 
 			
 					REVERSE A STRING 
 QUESTION: A STRING WILL BE GIVEN, THE STRING MUST GET REVERSED
 		EXAMPLE: IF "gnana teja" IS THE GIVEN STRING, YOUR CODE MUST GIVE THE OUTPUT AS "ajet anang".
 				
 					GOOGLE QUESTION
 QUESTION: FIRST LETTER OF EACH WORD IN A STRING MUST TURN TO UPPERCASE
 		EXAMPLE: IF "gnana teja" IS THE GIVEN STRING, YOUR CODE MUST GIVE THE OUTPUT AS "Gnana Teja"
 			 
 			 		CGI QUESTION
 QUESTION: DEDUCT '1' FROM THE LENGTH OF THE PALINDROME WORD/PALINDROME IN THE PART OF THE WORD FROM START.
 		EXAMPLE: IF "TESTSETABCD" IS THE GIVEN STRING. YOUR CODE MUST GIVE THE OUTPUT AS "6" i.e.., LENGTH OF PALINDROME 'TESTSET' IS "7"
 						HENCE OUTPUT IS 7-1 = 6. 
 			 */  
	public static void main(String[] args) 
	{
		System.out.println(" ENTER \n '1' TO VIEW THE TCS EXAM MODE \n '2' FOR THE INTERACTIVE MODE \n '3' FOR THE DIVISION OF 2 NUMBERS \n '4' TO REVERSE A STRING \n '5' FOR EXECUTION FOR QUESTION ASKED IN GOOGLE \\n '5' FOR EXECUTION FOR QUESTION ASKED IN CGI");
		
		Scanner s=new Scanner(System.in);
		int mode = s.nextInt();
		
		if (mode==1) {
		
       // System.out.println("enter number of elements");

        int n=s.nextInt(); int temp=0;

        int B[]=new int[n];

       // System.out.println("enter elements");

        for(int i=0;i<n;i++){//for reading array
            B[i]=s.nextInt();}
        
        for (int i = 0; i < n; i++) {     
            for (int j = i+1; j < B.length; j++) {     
               if(B[i] < B[j]) {    
                   temp = B[i];    
                   B[i] = B[j];    
                   B[j] = temp;   }}}
        
        for (int i = 0; i < 3; i++) {     //CHANGE THE VALUE OF "i" BASED ON THE REQUIREMENT
            System.out.print(B[i] + " ");    
            }
		}
		
		else if(mode==2) 
		{
		
			try {
				InteractiveModel();}
			
			catch (Exception e) {System.out.println("****** Please check the validity of the input with respect to the instructions and complie again to enter the feed ******" );}
		} 
	
		else if (mode==3) {
		
			try{divisionMode();
			}
			
			catch (Exception e) {
				System.out.println("****** Please check the validity of the input with respect to the instructions and complie again to enter the feed ******" );
				}
			}
		
		else if (mode==4) {
		
			try { reversingString();
			}
		
			catch (Exception e) {
				System.out.println("****** Please check the validity of the input with respect to the instructions and complie again to enter the feed ******" );
			}
		}
		
		else if (mode==5) {
		
			try	{
				googleQuestion();
			}
			
			catch (Exception e) {
				System.out.println("****** Please check the validity of the input with respect to the instructions and complie again to enter the feed ******" );
			}
		}
		
		else if (mode==6) {
		
			try {
				questionCGI();
			}
			
			catch (Exception e) {System.out.println("****** Please check the validity of the input with respect to the instructions and complie again to enter the feed ******" );}
		}
	
		else {
			System.out.println("****** Please check the validity of the input with respect to the instructions and complie again to enter the feed ******");
			
		}
}
	

static void InteractiveModel() {

	System.out.println("			Welcome to the Data Entry page of GNANA TEJA store \n");
    System.out.println("Please enter the number products that you need to feed: ");

	Scanner s1=new Scanner(System.in);
     int n=s1.nextInt(); int temp=0;
     System.out.println("Please enter the product name SPACE then the price ");
    
     int B[]=new int[n];

     // for the output of the feed
     for(int i=0;i<n;i++){
    	 String product = s1.next();
         B[i]=s1.nextInt();
         int count = i+1; // for the S.No to be in correct order
         System.out.println("S.No: " + count + "\n" + "Product Name: "  +product+ "\n"+ "Price: " + B[i] );
     }
     
     
     // to know the top 3 prices in the feed
     System.out.println("Do you need the top 3 prices? (TYPE '1' for Yes and '2' for No)");
     
     int top = s1.nextInt();
     
     if (top==1) { 
    	 System.out.print(" The top 3 prices are: ");
     
    	 for (int i = 0; i <n; i++) {     
         for (int j = i+1; j < B.length; j++) {     
            if(B[i] < B[j]) {    
                temp = B[i];    
                B[i] = B[j];    
                B[j] = temp;   }}}
     
    	 for (int i = 0; i < 3; i++) {     //CHANGE THE VALUE OF "i" BASED ON THE REQUIREMENT
         System.out.print(B[i] + " ");    
         }
     
    	 System.out.println("\n     ******Thank you for the feed. Please compile again to enter the new feed*****");
     }
     
     else {System.out.println("\n     ******Thank you for the feed. Please compile again to enter the new feed*****");}
     
	}


static void divisionMode() 
{
	Scanner s2 = new Scanner(System.in);
	System.out.println("Enter the Numerator:");
	int a =s2.nextInt();
	
	System.out.println("Enter the Denominator");
	int b = s2.nextInt();
	
	int chances = 4;
	
	for (int i=0; i<4;i++)
	{
	
		try {
			System.out.println(a/b);
			break;
			}
		
		catch (Exception e) 
		{
		
			chances--;
			
			if (chances==0) 
			{
			System.out.println("All the given attempts got failed. Hence terminated!");
			}
			
			if (chances!=0)
			{
			System.out.println("Please re-enter a valid input for the Denominator (cant divide by Zero) "+ chances+" attempt/s remaining");
			b=s2.nextInt();
			}
		}
	}
}


static void reversingString() 
{
	System.out.println("Please enter the string");
	
	Scanner s3= new Scanner(System.in);
	String a = s3.nextLine();

	char b[] = a.toCharArray();
	char temp = ' ';
	
	for (int i=0; i<b.length;i++) {
		for (int j=i+1;j<b.length;j++) {
			temp = b[i];
			b[i] = b[j];
			b[j] = temp;
		}
	}
	
	StringBuffer  T= new StringBuffer();
	
	for (int i=0; i<b.length;i++)
		{
			T.append(b[i]);
		}
		String c = T.toString();
		System.out.println(c);
	}


static void googleQuestion() 
	{
	System.out.println("Please enter a string ");
	Scanner s4 = new Scanner(System.in);
	String a = s4.nextLine();

	String b[] = a.split("\\s");
	
	StringBuffer T = new StringBuffer();
	
	String e = "";
	
	for (String x : b) 
	{
	e = e+ x.substring(0,1).toUpperCase() + x.substring(1) + " "; // or e += x.substring(0,1).toUpperCase() + x.substring(1) + " "; 
		//System.out.print(e + " ");
	}
	System.out.print(e.trim()); // trim() is used to delete the spaces in the front and after the string 
	}


static void questionCGI() 
	{
	
	System.out.println("Please enter the word");

	Scanner s5 = new Scanner(System.in);
		String a = s5.nextLine();
	
		char b[] = a.toCharArray();
		char temp = ' ';
		
		int l = 0;
		
		StringBuffer T = new StringBuffer();
		
		for (int i = 0; i< b.length; i++) {
			for (int j = i+1; j< b.length; j++) {
				temp = b[i];
				b[i] = b[j];
				b[j] = temp;
			}
		}
		
		int x= b.length-1;
		
		for (int i = 0; i < b.length; i++ ) {
			for (;x>0 && x<b.length;x--) {
				char c[] = a.toCharArray();
		
				if (c[i] != b[i] || c[x] != b[x])
			{
				T.append(b[x]);
			}
			//x--; if you want to use only one for loop use this line
		}
		}
		
		int z = (T.length())-2;
		
		System.out.println(T);
		
		if (z==-2) {
			System.out.println((b.length)-1);
		}
		
		else {
			System.out.println(z);
		}
	}
}
