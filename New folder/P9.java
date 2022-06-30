package starPattern;

public class P9 {

	public static void main(String[] args) {
		int n=5;
		int sp=n-1;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= sp; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <i ; j++) {
				System.out.print("* ");
			}
			sp--;
			System.out.println();
		}
 
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j >=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}

