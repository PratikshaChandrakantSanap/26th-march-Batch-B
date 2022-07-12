package logicalProgram;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
//		Scanner s= new Scanner(System.in);
//		System.out.println("Enter the string");
//		String a = s.next();
//		String b="";
//		for(int i=a.length()-1;i>=0;i--)
//		{
//			b=b+a.charAt(i);
//			System.out.println(i);
//		}
//		System.out.println("original string is "+a);
//		System.out.print("Reverse string is "+b);
		Scanner sc=new Scanner(System.in);//using user input
		System.out.println("Enter String Name");
		
		String a = sc.next();
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
			
		}
		System.out.println("reverse string is "+b);
		System.out.println("oringiinal string is "+a);
		
		
//		String p="Pratiksha";//fixed string
//		String q="";
//		for(int i=p.length()-1;i>=0;i--)
//		{
//			p.charAt(i);
//		}
//		System.out.println("original string is "+p);
//		System.out.println("reverse string is "+q);
//		

	}

}
