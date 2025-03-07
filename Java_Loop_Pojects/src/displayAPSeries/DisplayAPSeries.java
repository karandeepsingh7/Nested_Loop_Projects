package displayAPSeries;
import java.util.*;

public class DisplayAPSeries {

	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Taking Starting Point Input
		System.out.print("Enter Starting Number : ");
		int startInput = sc.nextInt();		
		
		//Taking Common Difference Input
		System.out.print("Enter Common Difference : ");
		int commonInput = sc.nextInt();	
		
		//Taking No. of Terms Input
		System.out.print("Enter No. of Terms : ");
		int termInput = sc.nextInt();	
		
		
		for (int i=termInput; i>0 ;i--)
		{
			System.out.print(startInput+", ");
			int newNum = startInput+commonInput;
			startInput = newNum;
			
		}

	}

}
