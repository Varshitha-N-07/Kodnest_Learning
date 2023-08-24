import java.util.Scanner;

public class Main {
	public static void calculateSum(int n)
	{
		//System.out.println(n*(n+1)/2);
		int sum = 0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		calculateSum(n);
	}
}
