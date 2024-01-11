import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long ans=calculateFactorial(n);
        System.out.println(ans);

    }


    public static long calculateFactorial(int n){
        if(n==0){
            return 1;
        }
        return n*calculateFactorial(n-1);

    }
}
