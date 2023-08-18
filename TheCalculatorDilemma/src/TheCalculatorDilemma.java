import java.util.Scanner;

public class TheCalculatorDilemma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("Enter your choice (1 to 4) :");
		System.out.println("1.ADDITION"+'\n'+"2.SUBTRACTION"+'\n'+"3.MULTIPLICATION"+'\n'+"4.DIVISION"+'\n');
		
		int ch = scan.nextInt();
		calculate(ch,a,b);
		
		
	}
	public static void calculate(int choice, int a, int b)
	{
		
		switch(choice)
		{
		case 1 : System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
					break;
		case 2 : System.out.println("Subtraction of "+a+" and "+b+" is "+(a-b));
					break;
		case 3 : System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
					break;
		case 4 : System.out.println("Division of "+a+" and "+b+" is "+(a/b));
					break;
		default : System.out.println("Enter valid choice");
		}
		
	}
}
