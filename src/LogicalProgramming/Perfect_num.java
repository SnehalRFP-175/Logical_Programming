package LogicalProgramming;
import java.util.Scanner;

public class Perfect_num 
{
	public static void main(String a[])
	{
		
	int num, s=0;  
	
	Scanner sc=new Scanner(System.in);         
	System.out.print("Enter the number: ");  
	num=sc.nextInt();  
	int i=1;  
	  
	while(i <= num/2)  
	{  
	if(num % i == 0)  
	{ 
		s=s+i;
	} 	i++;  
	} 
	if(s==num)  
	{  
	 
	System.out.println("Number is a perfect number.");  
	}  
	else   
	System.out.println(" Number is not a perfect number.");   
	}  
	 

}



