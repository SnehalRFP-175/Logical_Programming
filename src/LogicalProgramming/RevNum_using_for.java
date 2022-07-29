package LogicalProgramming;

public class RevNum_using_for 
{
	public static void main(String[] args)   
	{  
	int num = 1234;  
	int rev=0;
	for (int rem=0;num != 0;num = num/10)   
	{  
	  rem = num % 10;  
	  rev = rev * 10 + rem;    
	}  
	System.out.println("The reverse Number is: " + rev);  
	}  
}  



