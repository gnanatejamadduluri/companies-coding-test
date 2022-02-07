package gnanaPractice;

import java.util.Scanner;

public class homeWork1 {
public static void main(String[] args) {
	System.out.println("Enter \n '1' to print only even numbers from 15 to 25 \n '2' to print sum of all numbers divisible by '4' from 5 to 25 \n '3' to print product of all numbers divisible by '3' from 7 to 15 \n '4' to print count of odd numbers from 21 to 45 \n '5' to print all alphabet except H and U \n '6' to print sum of all even numbers from 4 to 13 \n '7' to print count of all numbers from 30 to 50 except multiples of 4");
	Scanner S = new Scanner(System.in);
	int mode = S.nextInt();
if (mode==1) {
	homeWork1();}
if (mode==2) {
	homeWork2();}
if (mode==3) {
	homeWork3();}
if (mode==4) {
	homeWork4();}
if (mode==5) {
	homeWork5();}
if (mode==6) {
	homeWork6();}
if (mode==7) {
	homeWork7();}
}	

//write a programme to print only even numbers from 15 to 25
	static void homeWork1() {
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter the lower limit(number): ");
		int N1 = S1.nextInt();
		System.out.println("Enter the upper limit(number): ");
		int N2 = S1.nextInt();
		System.out.println("List of even numbers from "+N1+ " to "+N2+" are:");
		for (int i=N1;i<=N2;i++) {
			if ((i%2)==0) {
				System.out.print(i+" ");
			}
		}
}

//write a programme to print sum of all numbers divisible by '4' from 5 to 25
	static void homeWork2() {
		Scanner S2 = new Scanner(System.in);
		System.out.println("Enter the lower limit(number): ");
		int N1 = S2.nextInt();
		System.out.println("Enter the upper limit(number): ");
		int N2 = S2.nextInt();
		int N=0;
		System.out.println("List of numbers divisible by '4' from "+N1+ " to "+N2+" are:");
		for (int i=N1;i<=N2;i++) {
			if (i%4==0) {
				N+=i;
				System.out.print(i+" ");
			}
		}
		System.out.println("\n Sum of numbers divisible by '4' from "+N1+ " to "+N2+" is: "+N);
	}
	
//write a programme to print product of all numbers divisible by '3' from 7 to 15
	static void homeWork3() {
		Scanner S3 = new Scanner(System.in);
		System.out.println("Enter the lower limit(number): ");
		int N1 = S3.nextInt();
		System.out.println("Enter the upper limit(number): ");
		int N2 = S3.nextInt();
		int N=1;
		System.out.println("List of numbers divisible by '3' from "+N1+ " to "+N2+" are:");
		for (int i=N1;i<=N2;i++) {
			if (i%3==0) {
				N*=i;
				System.out.println(i+" ");
			}
		}
		System.out.print("\n Product numbers divisible by '3' from "+N1+ " to "+N2+" is "+N);
	}
	
//write a programme to print count of odd numbers from 21 to 45
	static void homeWork4() {
		Scanner S4 = new Scanner(System.in);
		System.out.println("Enter the lower limit(number): ");
		int N1 = S4.nextInt();
		System.out.println("Enter the upper limit(number): ");
		int N2 = S4.nextInt();
		int N=0;
		System.out.println("List of odd numbers from "+N1+ " to "+N2+" are:");
		for (int i=N1;i<=N2;i++) {
			if (i%2!=0) {
				N++;
				System.out.print(i+" ");
			}
		}
		System.out.println("\n count odd numbers from "+N1+ " to "+N2+" is: "+N);
}
	
//write a programme to print all alphabet except H and U
static void homeWork5() {
	System.out.println("all alphabet except H and U both in lower and upper case are: ");
	for (char i='a';i<='z';i++) {
		if ((i!='h') && (i!= 'u')) {
			System.out.print(i+" ");
		}
	}
	System.out.println();
	for (char j='A';j<='Z';j++) {
		if ((j!='H') && (j!= 'U')) {
			System.out.print(j+" ");
		}
	}
}

//write a programme to print sum of all even numbers from 4 to 13
static void homeWork6() {
	Scanner S6 = new Scanner(System.in);
	System.out.println("Enter the lower limit(number): ");
	int N1 = S6.nextInt();
	System.out.println("Enter the upper limit(number): ");
	int N2 = S6.nextInt();
	int N=0;
	System.out.println("List of even numbers from "+N1+ " to "+N2+" are:");
	for (int i=N1;i<=N2;i++) {
		if (i%2==0) {
			N+=i;
			System.out.print(i+" ");
		}
	}
	System.out.println("\n Sum of all even numbers from "+N1+ " to "+N2+" is: "+N);
}

//write a programme to print count of all numbers from 30 to 50 except multiples of 4
static void homeWork7() {
	Scanner S7 = new Scanner(System.in);
	System.out.println("Enter the lower limit(number): ");
	int N1 = S7.nextInt();
	System.out.println("Enter the upper limit(number): ");
	int N2 = S7.nextInt();
	int N=0;
	System.out.println("List of all numbers from "+N1+ " to "+N2+" except multiples of 4 are:");
	for (int i=N1;i<=N2;i++) {
		if (i%4!=0) {
			N++;
			System.out.print(i+" ");		
		}
	}
	System.out.println("\n count of all numbers from "+N1+ "to "+N2+" except multiples of 4 is: "+N);
	
}
}
