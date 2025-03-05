package ArmstrongNumber;
import java.util.*;

public class scloop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number to check : ");
		
		int input = sc.nextInt();
		int copyinput = input;
		double total = 0; 
		int count = 0;
		
		int temp = input;
		while (temp > 0)
		{
			temp = temp/10;
			count++;
		}
		
		while (input > 0)
		{
			int r = input%10;
			input = input/10;
			double cube = Math.pow(r, count);
			total = total + cube; 
		}
		
		System.out.println(total);
		if (copyinput == total)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("NOT Armstrong");
		}
		
		
		
		
	}

}
