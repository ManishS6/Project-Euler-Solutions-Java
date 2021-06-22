import java.util.Scanner;

public class six {
	
	static int _nSum(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	
	static int _n2Sum(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum+=i*i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("The value of n is");
		int n = in.nextInt();
		int nSum = _nSum(n);
		int n2Sum = _n2Sum(n);
		int res = nSum*nSum-n2Sum;
		System.out.println("The Answer is "+res);
	}
}
