package reverseNumber;
import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number to reverse : ");
		
		int input = sc.nextInt();
		
		int t = 0;
		int rev = 0;
		
		while(input > 0)
		{
			int r = input%10;
			rev = (t*10) + r;
			t = rev;
			input = input/10;
		}
		System.out.println(rev);
	}

}
