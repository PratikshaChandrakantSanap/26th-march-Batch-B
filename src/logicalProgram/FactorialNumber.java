package logicalProgram;

public class FactorialNumber {

	public static void main(String[] args) {
		int num = 5;
		int num1 = 1;
		for(int i=num;i>=1;i--)
		{
			num1=i*num1;
		}
		System.out.println("factorial is "+num1);

	}

}
