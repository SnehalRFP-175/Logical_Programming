package LogicalProgramming;

import java.util.Scanner;

public class Prime_num 
{
	public static void main(String a[])
	{     
		Scanner sc=new Scanner(System.in);         
		System.out.print("Enter the number: ");  
		int n=sc.nextInt(); 
		
		boolean flag = false;
	    for (int i = 2; i <= n / 2; ++i) 
	    {
	      if (n % i == 0) 
	      {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(n + " is a Prime number.");
	    else
	      System.out.println(n + " is not a Prime number.");
	 
		}    
	}

