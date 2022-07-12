package logicalProgram;

public class NoOfWhiteSpaceInString {



	public static void main(String[] args) {
		String a="P r a t i k s h a ";
		int count = 0;
		for(int i=0;i<=a.length()-1;i++)
		{
			char mychar = a.charAt(i);
		
		if(mychar==' ')
		{
			count++;
		}
		} 
		System.out.println("number of space in "+a+" is "+count );
	}
	

}
