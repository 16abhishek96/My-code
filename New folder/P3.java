package starPattern;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		for (int i = 0; i < 5; i++ ) {
			//	for (int j = 5; j > i; j--) {
			for (int j = 0; j < n; j++) {
				if (i+j<=n-1) 		
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}

/*

p3
 * * * * * 
 * * * * 
 * * * 
 * * 
 * 



 */