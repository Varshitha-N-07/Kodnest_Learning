import java.util.Scanner;

public class TheDoubleTrouble {
public static void main(String []args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number to be doubled");
	int n = scan.nextInt();
	System.out.println(doubleTheNumber(n));
	}
public static int doubleTheNumber(int num)
{
	return num*2;
}

}
