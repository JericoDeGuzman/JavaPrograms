import java.util.Scanner;
public class Fibo {
   
    
        static int fibo(int n){

        if (n <= 1)
            return 1;
        else
            return fibo(n - 1) + fibo(n - 2);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of range :");

        int n = sc.nextInt();

        System.out.println("Fibonacci number is " + fibo(n-1));
    
    }
    
}
