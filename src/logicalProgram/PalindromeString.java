package logicalProgram;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String a = sc.next();
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println("reverse string is "+b);
		if(a.equals(b))
		{
			System.out.println("string is in palindrome");
		}
		else
		{
			System.out.println("string is not in palindrome");
		}
		

	}

}
