import java.util.Scanner;

public class TemperatureConverterApp {
public static void main(String []args)
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the temperature to convert");
	double c = scan.nextDouble();
	TemperatureConverter tc = new TemperatureConverter();
	System.out.println(tc.convertFahrenheitToCelsius(c));

	}

}
