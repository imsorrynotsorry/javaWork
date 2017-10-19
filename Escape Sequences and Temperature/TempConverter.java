//*************************************************
//TempConverter.java     
//
//Demonstrates the use of algorithms, primitive
//data types, and arithmetic expressions.
//
//*************************************************

public class TempConverter
{
	public static double calculateFahrenheitTemp(double c)
	{
		//computes the fahrenheit equivalent of a specific
		//celsius temperature using the formula
		// F = (9/5)C + 32.   
		// 9 / 5 is 1
		// 9.0 / 5.0 is 1.8   Use a double instead
		final double CONVERSION_FACTOR = 9.0 / 5.0;
		double F = CONVERSION_FACTOR*c + 32.0;
		return F;
	}
	public static double calculateCelsiusTemp(double f)
	{
	    double C;
	    
	    return C;
	}
	public static void main (String[] args)
	{
		//initialize celsiusTemp variable  setup with a value
		double celsiusTemp = 24.0;
		
		
		//declare variable for fahrenheit temperature
		//left 'null' or without a value
		double fahrenheitTemp;
		
		System.out.println("Celsius Temperature: " + celsiusTemp); 
		fahrenheitTemp = calculateFahrenheitTemp(celsiusTemp);
		System.out.println("Fahrenheit Equivalent: " + fahrenheitTemp);
		
			
		
		fahrenheitTemp = 32.0;  //result should be 0
		
		System.out.println("Fahrenheit Temperature: " + fahrenheitTemp); 
		celsiusTemp = calculateCelsiusTemp(fahrenheitTemp);
		System.out.println("Celsius Equivalent: " + celsiusTemp);
	}
}