/*
Parking Garage
Programmer: Ryan J. Dross
Date: 10/20/16
Version: 1.0
*/
import java.util.Scanner;
public class RyanParkingGarage
{
	public static void main(String [] args)
	{
		double hours = 0;
		double hourCost = 0;
		int detailed = 0;
		String input = "";
		int parkingHours = 0;
		double cost = 10;
		double total = 0;


		Scanner keys = new Scanner(System.in);
		System.out.println("Welcome to the Parking Garage");
		System.out.println("How many hours will you park?");
		hours = keys.nextInt();

		if(hours > 4 && hours <= 8)
				{
                   parkingHours = 8;
				}
				if(hours > 8 && hours <= 12)
				{
					parkingHours = 12;
				}
				if(hours > 12 &&  hours <= 16)
				{
					parkingHours = 16;
				}

			System.out.println("Okay we will charge you for " + parkingHours + "hours");

		System.out.println("Would you like your car detailed?(yes or no)");
		input = keys.next();
				if(input.equals("yes"))
					{
						detailed = 5;
					}
				else
					{
						detailed = 0;
					}

		if(hours > 4 && hours <= 8)
		{
			hourCost = cost + 5;
		}
		if(hours > 8 && hours <= 12)
		{
			hourCost = cost + 10;
		}
		if(hours > 12 &&  hours <= 16)
		{
			hourCost = cost + 15;
		}

		total = detailed + hourCost;
		System.out.println("Parking will cost you " + total);

	}
}