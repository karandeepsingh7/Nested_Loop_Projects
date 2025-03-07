package displayNumbersInWords;
import java.util.*;

public class DisplayNumbersInWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		
		int input = sc.nextInt();
		
		String str = "";
		
		while(input > 0)
		{
			int r = input%10;
			input = input/10;
			str = str+r;			
			
		}
		System.out.println(str);
		
		char rev;
		for (int i = str.length()-1; i >=0;i--)
		{
			rev=str.charAt(i);
			
			if(rev == '1')
			{
				System.out.println("ONE");
			}
			else if(rev == '2')
			{
				System.out.println("TWO");
			}
			else if(rev == '3')
			{
				System.out.println("THREE");
			}
			else if(rev == '4')
			{
				System.out.println("FOUR");
			}
			else if(rev == '5')
			{
				System.out.println("FIVE");
			}
			else if(rev == '6')
			{
				System.out.println("SIX");
			}
			else if(rev == '7')
			{
				System.out.println("SEVEN");
			}
			else if(rev == '8')
			{
				System.out.println("EIGHT");
			}
			else if(rev == '9')
			{
				System.out.println("NINE");
			}
			else
			{
				System.out.println("ZERO");
			}
			
		}
		

	}

}
