public class two {
    public static void main(String[] args) {
        int x=1;
        int y=2;
        int nextTerm;
        long sum=0;
        boolean M = true;
        while(M){
            if(x%2==0  && x<=4000000){
                sum+=x;
            }
            nextTerm=x+y;
            x=y;
            y=nextTerm;
            if(x>4000000){
                M=false;
            }
        }
        System.out.println("The Sum is: "+sum);
    }
}

