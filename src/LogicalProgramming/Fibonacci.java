package LogicalProgramming;

public class Fibonacci 
{
	public static void main(String args[])
	{
		int num1 = 0, num2 = 1;
		int N = 5;
		int counter = 0;
		System.out.print("Fibonacci Series-->");
		
		while (counter < N) {
			System.out.print(num1 + " ");
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			counter = counter + 1;
			
		}		
	}
}



