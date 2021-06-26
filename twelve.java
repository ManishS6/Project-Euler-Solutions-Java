public class twelve {
    public static int triangleNumber(int n){
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }
    public static int numberOfDivisors(int n){
        int count=0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {
                count++;
            }
        }
        return count;
    }
    public static void Constraint(){
        int divs = 0;
        int n = 1;
        while(true){
            if(divs>=250){
                break;
            } else {
                divs = numberOfDivisors(triangleNumber(n));n++;
                System.out.println("Current # Divisors → "+divs);
            }
        }
        System.out.println("The desired triangle number is → "+triangleNumber(n));
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println("The triangle Number #"+i+" is → "+triangleNumber(i));
        //     System.out.println("The #Divs of triangle Number #"+i+" is → "+numberOfDivisors(triangleNumber(i)));
        // }
    }
    public static void main(String[] args){
        long start=System.currentTimeMillis();
        Constraint();
        long end=System.currentTimeMillis();
        System.out.println("Time for execution → "+(end-start)+"ms");
    }
}
