package pattern6;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				count++;
				System.out.print(count + " ");
				
			}
			System.out.println("");
		}
	}

}
