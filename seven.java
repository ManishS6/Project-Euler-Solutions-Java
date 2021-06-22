import java.util.Scanner;

public class seven {
	
	static boolean _isPrime(int num) {
		boolean flag = true;
	    for (int i = 2; i <= num / 2; ++i) {
	      if (num % i == 0) {
	        flag = false;
	        break;
	      }
	    }
		return flag;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c = 0 ;
		int res;
		int i=2;
		while(c!=n) {
			if(_isPrime(i)) {
				c++;
			} i++;
		}
        res = i-1;
		System.out.println("The ans is "+res);
//		System.out.println("The ans is "+_isPrime(2));
	}
}
