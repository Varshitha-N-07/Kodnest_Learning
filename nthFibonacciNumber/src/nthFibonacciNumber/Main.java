package nthFibonacciNumber;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	System.out.println(fib(n));
	
	}
	public static int fib(int n)
    {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        
        return b;
        
    }
}