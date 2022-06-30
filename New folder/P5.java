package starPattern;

public class P5 {

	public static void main(String[] args) {
		int n=5;
		//int sp=1;
		int sp=n-1;

		for (int i = 1; i <= n; i++) {
			
			for (
		int j =1; j <= sp  ;j++) {		System.out.print("  ");
			}
			sp--;
			
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}


}
/*

  	   * 
  	 * * * 
   * * * * * 
 * * * * * * * 
* * * * * * * * * 


*/