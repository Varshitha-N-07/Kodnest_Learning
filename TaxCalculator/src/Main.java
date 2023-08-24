import java.util.Scanner;

public class Main {
	public static double calculateTotalWithTax(double pa , double tr)
	{
		double taxAmt = pa*tr;
		return pa+taxAmt;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the purchase amount : ");
		double pa = scan.nextDouble();
		System.out.println("Enter the tax rate(in decimal form : ");
		double tr = scan.nextDouble();
		System.out.println("Total cost including tax : "+calculateTotalWithTax(pa,tr));
	}
}
