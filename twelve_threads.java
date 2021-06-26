import java.util.Scanner;

public class twelve_threads extends Thread 
{ 
	private String threadname; 
	Thread t;
	// int[] a = new int[5];
    // int divs = 0;
    int num;
	twelve_threads tob;

    public twelve_threads(String name, twelve_threads obj)
    { 
        threadname = name;
        tob = obj;
    }

    public twelve_threads()
    {
        
    }

    @Override
    public void start() 
    { 
        System.out.println("Starting " + threadname); 
        if (t == null) {
            t = new Thread(this, threadname);
            t.start(); 
        }
    }

    // public static int triangleNumber(long n){
    //     int sum=0;
    //     for (int i = 1; i <= n; i++) {
    //         sum+=i;
    //     }
    //     return sum;
    // }
    private static int numberOfDivisors(long number) {
        int nod = 0;
        int sqrt = (int) Math.sqrt(number);
     
        for(int i = 1; i<= sqrt; i++){
            if(number % i == 0){
                nod += 2;
            }
        }
        if (sqrt * sqrt == number) {
            nod--;
        }
     
        return nod;
    }
    public void Constraint(){
        int divs = 0;
        // long n = 1;
        long a=1;
        long b=0;
        while(true){
            if(divs>num){
                break;
            } else {
                b+=a;
                a++;
                divs = numberOfDivisors(b);
                System.out.println("Current # Divisors → "+divs);
            }
        }
        System.out.println("The desired triangle number is → "+b);
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println("The triangle Number #"+i+" is → "+triangleNumber(i));
        //     System.out.println("The #Divs of triangle Number #"+i+" is → "+numberOfDivisors(triangleNumber(i)));
        // }
    }

    @Override
    public void run() 
    { 
        switch (threadname)
        {
        case "child1": tob.Constraint();break; 
        } 
    }

    public static void main(String[] args) 
    { 
        twelve_threads obj =new twelve_threads();
        Scanner sc=new Scanner(System.in); 
        obj.num=sc.nextInt(); 
        sc.close();
        twelve_threads obj1 =new twelve_threads("child1",obj); 
        obj1.start();
    }
}