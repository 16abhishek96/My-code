package starPattern;

public class P7 {
	public static void main(String[] args) {

		int n = 5;
		int s = n - 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= s; j++) {
				System.out.print(" ");
			}
			s--;
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

		s=1;
		for(int i=1;i<=n-1 ;i++) {
			for(int j=1;j<=s;j++) {
				System.out.print(" ");
			}
			s++;
			for(int j=1;j<=2*(n-i)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
