import java.util.Scanner;

public class Main
{
	public static void getProduct(String productCode)
	{
		switch(productCode)
		{
		case "p01" : System.out.println("Coco cola");
						break;
		case "p02" : System.out.println("Pepsi");		
						break;
		case "p03" : System.out.println("Fanta");
						break;
		case "p04" : System.out.println("Jaljeera");
						break;
		case "p05" : System.out.println("Mountain dew");
						break;
		case "p06" : System.out.println("Boat guav");
						break;
		default : System.out.println("Panaka");
					
		}
	}
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter product code");
		String pcode = scan.next();
		getProduct(pcode);
		
	}
}
