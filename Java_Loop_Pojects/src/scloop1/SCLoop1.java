/**
 * Project : Display Multiplication Table
 */

package scloop1;

import java.util.*;

public class SCLoop1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(n+" x "+i+" = "+n*i);
		}
		

	}

}
