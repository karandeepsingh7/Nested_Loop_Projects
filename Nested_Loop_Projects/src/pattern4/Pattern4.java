package pattern4;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				count++;
				System.out.format("%02d",count);
				
			}
			System.out.println("");
		}
	}

}
