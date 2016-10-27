/* Adder.java
Programmer: Ryan Dross
Date: 10/27/16
Version 1.0
*/

import java.util.Scanner;

public class RyanAdder
{
	public static void main(String[] args)
	{
		Scanner keys = new Scanner(System.in);
		double addAgain = 1;
		double total = 0;

		while(addAgain != 0)
		{
			System.out.println("Enter a number(0 to quit)");
			addAgain = keys.nextDouble();

			total = addAgain + total;
		}
			System.out.println("The Sum of the numbers entered is " + total);
	}
}