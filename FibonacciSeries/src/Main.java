import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printFibonacciSeries(n);
		
	}
	public static void printFibonacciSeries(int n)
	{	
		int n1=0;
		int n2=1;
		if(n==1)
		{
			System.out.println(n);
		}
		else if(n==2)
		{
			System.out.println(n1+" "+n2);
		}
		else
		{
			System.out.print(n1+" "+n2);
		for(int i=3;i<=n;i++)
		{
			int n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		}
		
		
	}

}
