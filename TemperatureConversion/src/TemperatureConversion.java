import java.util.Scanner;

public class TemperatureConversion {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("Select an option : "+'\n'+"1. Convert Celsius to Fahrenheit"+'\n'+"2. Convert Fahrenheit to Celsius ");
		System.out.println("Enter your choice : ");
		int ch = scan.nextInt();
		switch(ch)
		{
		case 1 : System.out.println("Enter the temperature in celsius : ");
				 double c = scan.nextDouble();
				 CelsiusToFahrenheit cf = new CelsiusToFahrenheit();
				 System.out.println(c+"C is equivalent to "+cf.celsiusToFahrenheit(c)+"F");
				 break;
		case 2 : System.out.println("Enter the temperature in fahrenheit : ");
				 double f = scan.nextDouble();
				 FahrenheitToCelsius fc = new FahrenheitToCelsius();
				 System.out.println(f+"F is equivalent to "+fc.fahrenheitToCelsius(f)+"C");
				 break;
		default : System.out.println("Enter the valid choice!!!");			
		}
	}
}
