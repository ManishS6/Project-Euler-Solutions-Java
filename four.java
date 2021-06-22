public class four {
	static boolean pali(int n) {
		String LR = String.valueOf(n);
		StringBuilder sLR = new StringBuilder(LR).reverse();
		String RL = String.valueOf(sLR);
		if(LR.equals(RL)) {
			return true;
		}
		return false;
	}
	static int calc(int n) {
		int tens = (n+1)/10;
		int res=0;
		for(int i=n ; i>=tens ; i--) {
			for(int j=i ; j>=tens ; j--) {
				System.out.println("Testing "+i+"*"+j);
				if(pali(i*j) && i*j>res) {
					res = i*j;
					if(j>tens) {
						tens = j;
					} break;
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {		
		int res = calc(999);
		System.out.println("The Answer is "+res);
//		System.out.println(Math.pow(2, 10));
	}
}
