package gcdCalculator;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();
	findGCD(a,b);
}
public static void findGCD(int a , int b)
{
	int gcd = 1;
    for (int i = 1; i<= a && i<= b; i++)
    {
      // check if i perfectly divides both n1 and n2
      if (a % i == 0 && b % i == 0)
        gcd = i;
    }
    System.out.println("GCD of " + a +" and " + b + " is " + gcd);
}

}
