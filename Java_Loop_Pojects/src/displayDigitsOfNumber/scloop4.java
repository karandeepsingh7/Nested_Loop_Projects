package displayDigitsOfNumber;
import java.util.*;

public class scloop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter Number for digits : ");
			
			int input = sc.nextInt();
			int count = 0;
			
			while (input > 0)
			{
				int r = input%10;
				input = input/10;
				//System.out.print(r);
				count++;
			}
			System.out.print(count);
	}

}
