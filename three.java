public class three {
    static long isPrime(long n){
        int count = 0;
        for (int i = 2; i <= n/2; i++) {
            if (n%i==0) {
                count++;break;
            }
        }
        if(count==0){
            return 1;
        } else{
            return 0;
        }
    }
    public static void main(String[] args){
        long n = 600851475143L;
        long i;
        for(i=n;i>0;i--){
            if(n%i==0){
                if(isPrime(i)==1){
                    break;
                }
            }
        }
        System.out.println("The Answer is: "+i);
    }
}
