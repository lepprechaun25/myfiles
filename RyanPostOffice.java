/*
PostOffice
Programmer: Ryan J. Dross
Date: 10/20/16
Version: 1.0
*/

import java.util.Scanner;
public class RyanPostOffice
{

	public static void main(String args[])
	{
		Scanner keys = new Scanner(System.in);
		String input = "";
		double pounds;
		double priority = 0;
		double shipping = 0;
		double shippingState = 0;
		double perPound = 0;


		System.out.println("Welcome to the Post Office!");
		System.out.println("Will your package be staying in state(yes or no)");
		input = keys.next();
		if(input.equals("yes"))
		{
			shippingState = 1;
		}
		else
			{
				shippingState = 2;
			}
		System.out.println("Choose a priority.");
		priority = keys.nextDouble();
		if(priority == 1)
		{
			perPound = 5;
		}
		if(priority == 2)
		{
			perPound = 3;
		}
		if(priority == 3)
		{
			perPound = 1;
		}
		System.out.println("Enter a weight in Pounds");
			pounds = keys.nextDouble();

		shipping = (pounds + perPound) * shippingState;

		System.out.println("Thank you!");
		System.out.println("Your package will cost cost " + shipping + " to ship");
	}

}