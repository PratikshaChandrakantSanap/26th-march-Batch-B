package logicalProgram;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a = sc.nextInt();
		if(a%2==0)
		{
			System.out.println("given number is even");
		}
		else
			System.out.println("given number is odd");
//		if(a%2!=0)
//		{
//			System.out.println("number is odd");
//		}
//		else
//		{
//			System.out.println("number is even");
//		}

	}

}
