import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {

        //  I imported the scanner class here to take the value from user
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //   taking non negative integer value from user
        long ans=calculateFactorial(n);  //  calling the calculateFactorial function and
        // store the value in long data type because we are getting the value in long form
        System.out.println(ans);   //  now print the ans

    }


    public static long calculateFactorial(int n){           //  here we declare a function and taking int as a parameter
        if(n==0){   //   base case if it reaches n=0 it will return 1
            return 1;
        }
        return n*calculateFactorial(n-1);   //  here we are calling function again with the multiplication of n
                    //  lets how its working
                        // n=5;
                    // 5*cal(5-1)
                    // 4*cal(4-1)
                    //3*cal(3-1)
                    //2*cal(2-1)
                    //1*cal(1-1)  now here our base case will trigger and it will return 1
                    //  it goes to next step with value 1;
                    //2*1=2
                    //3*2=6
                    //6*4=24
                    //5*24=120
        // and it will return the value 120 to the function
    }
}
