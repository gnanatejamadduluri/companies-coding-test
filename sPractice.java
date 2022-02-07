package gnanaPractice;

import java.util.Scanner;

public class sPractice {
	public static void main(String[] args) {
		
		System.out.println("Enter \n '1' for product of Natural Numbers \n '2' for factorial of a number \n '3' for printing numbers horizontally \n '4' for Tech Mahindra Coding question still more complicated ");
		
		Scanner S = new Scanner(System.in);
		int mode = S.nextInt();
		
		if (mode==1) {
		pNatural();}
		
		else if (mode==2) {
		factNatural();}
		
		else if (mode==3) {
		horizonNatural();}
		
		else if (mode==4) {
		techMahi();}
		
	}
	
	
// length of the array and an array will be given, find the highest possible value when the number at (i+1)th subtracted from number at (i)th position.
static void techMahi() {
		System.out.println("To the highest possible value when the number at (i+1)th subtracted from number at (i)th position");
		Scanner S4 = new Scanner(System.in);
		
		System.out.println("Please enter number of elements in the array:");
		
		int N = S4.nextInt();
		int[] k = new int[N];
		
		System.out.println("Please enter the array input line by line:");
		
		for (int i=0;i<N;i++) {
			k[i] = S4.nextInt();
			}
		//for (int i=0;i<n;i++) {System.out.println(k[i]);}
		
	//	int n=5; int[] k= {1,2,3,4,100}; // for automatic input from developer side
		int[] S = new int[N];
		
		
		for (int i=0;i<=N-2;i++) {
		S[i] =k[i+1]-k[i];
		//System.out.println(h);
		}
		
		int temp=' ';
		
	
		for (int i=0;i<=N-2;i++) {
			//System.out.println(S[i]); // to check the array
			for (int j=i+1; j<N;j++) {
				if (S[i]>=S[j]) {temp=S[i];}				 
			}
		}
		
			System.out.println("the highest possible value when the number \n at (i+1)th subtracted from number at (i)th position is\n "+ "'"+temp+"'");
	}
	
	
//write a programme to find product of 1st N natural numbers
static void pNatural() {
	
	System.out.println("Enter the count of natural numbers: ");
	
	Scanner S1=new Scanner(System.in);
	int N = S1.nextInt();
	
	int prod=1;
	
	for (int i=1;i<=N;i++) {
		prod = prod*i;
	}
	System.out.println("The product of first "+N+" Natural numbers is "+prod);
}


//write a programme to find factorial of given number
static void factNatural() {
	
	int fact=1;

	System.out.println("Enter a natural number to get its factorial: ");
	
	Scanner S2=new Scanner(System.in);
	int N = S2.nextInt();
	
	for (int i=1;i<=N;i++) {
		fact = (fact*i);
	}
	
	System.out.println(" The factorial of " +N+ " is "+fact);
}


//write a programme to print numbers from 1 to N horizontally and then vertically
static void horizonNatural() {
	
	System.out.println("Enter the number to gets its numbers set beofore to it, Horizontally and then vertically: ");
	
	Scanner S3=new Scanner(System.in);
	int N = S3.nextInt();
	System.out.println("The numbers horizontally are: ");
	for (int i=1;i<=N;i++) {
		System.out.print(i+" ");
	}
	
	System.out.println("\n The numbers vertically are: ");
	for (int i=1;i<=N;i++) {
		System.out.println(i);
	}
}	
}
