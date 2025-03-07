package fibonacciSeries;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
				//Scanner
				Scanner sc = new Scanner(System.in);
				
				//Taking Starting Point Input
				System.out.print("Enter Starting Number : ");
				int firstInput = sc.nextInt();		
				
				//Taking Second Input
				System.out.print("Enter Second Number : ");
				int secondInput = sc.nextInt();	
				
				//Taking No. of Terms Input
				System.out.print("Enter No. of Terms : ");
				int termInput = sc.nextInt();	
				
				
				for (int i=0; i<termInput ;i++)
				{
					System.out.print(firstInput+", ");
					int third = firstInput+secondInput;
					firstInput = secondInput;
					secondInput = third;
					
				}

	}

}
