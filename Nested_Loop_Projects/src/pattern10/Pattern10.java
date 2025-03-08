package pattern10;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=9-i+1; j++)
			{
				if(i<=j) {
					System.out.print("* ");}
				else
					{System.out.print("  ");}
				
			}
			System.out.println("");
		}
		/*
		for(int i=1; i<=4; i++)
		{
			for(int j=0; j<=7-i+1; j++)
			{
				if(i<=j) {
					System.out.print("* ");}
				else
					{System.out.print("  ");}
				
			}
			System.out.println("");
		}
		*/
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=8-i+1; j++)
			{
				if(i<j) {
					System.out.print("* ");}
				else
					{System.out.print("  ");}
				
			}
			System.out.println("");
		}
	}

}
