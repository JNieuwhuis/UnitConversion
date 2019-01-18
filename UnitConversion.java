package extraAssignments;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class UnitConversion {
	
	public int unitConversion(Scanner input) {
		
		System.out.println("Enter the number you want to convert:  ");
		int number = input.nextInt();
		System.out.println("");
		
		return number;
	}
	
	public void getMiles(int number) {
		
		double getMiles = number * 0.621371192;
		getMiles =  new BigDecimal(getMiles).setScale(2, RoundingMode.HALF_UP).doubleValue();
		System.out.println(number + " km is " + getMiles + " miles.");
	}
	
	public void getFahrenheit(int number) {
		
		double getFahrenheit = ((number*(9/5)) +32);
		System.out.println(number + " degrees Celcius is " + getFahrenheit + " degrees Fahrenheit.");
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		UnitConversion km = new UnitConversion();
		UnitConversion celcius = new UnitConversion();
		
		int number = km.unitConversion(input);
		km.getMiles(number);
		
		number = celcius.unitConversion(input);
		celcius.getFahrenheit(number);
		
		input.close();
	}

}
