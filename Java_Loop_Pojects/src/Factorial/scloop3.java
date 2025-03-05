package Factorial;
import java.util.*;

public class scloop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter a Number : ");
			int input = sc.nextInt();
			
			int fact = 1;
			
			for (int i = 1;i<=input;i++)
			{
				fact = fact*i;
			}
			
			System.out.println("Factorial of " + input + " is = " + fact);
	}

}
