import java.util.Scanner;

public class ChangeMakerRyan
{

	public static void main(String [] args)
		{
			double cents = 0;
			double HundredDollars = 0;
			double FiftyDollars = 0;
			double TwentyDollars = 0;
			double TenDollars = 0;
			double FiveDollars = 0;
			double OneDollar = 0;
			double HalfDollar = 0.0;
			double Quarter = 0.0;
			double Dime = 0.0;
			double Nickel = 0.0;
			double Penny = 0.0;

			Scanner Keys = new Scanner(System.in);

			System.out.println("Welcome to Change Maker!");

			System.out.println("Enter amount of cents:");
			cents = Keys.nextDouble();

			HundredDollars = cents / 10000;
			System.out.println("you have " +HundredDollars+" in Hundred Dollar Bils.");

			FiftyDollars = cents / 5000;
			System.out.println("You have " + FiftyDollars + " in Fifty Dollar Bills");

			TwentyDollars = cents / 2000;
			System.out.println("You have " + TwentyDollars + " in Twenty Dollar Bills");

			TenDollars = cents / 1000;
			System.out.println("You have " + TenDollars + " in Ten Dollar Bills");

			OneDollar = cents / 100;
			System.out.println("you have " + OneDollar + " in dollar bills.");

			HalfDollar = cents / 50;
			System.out.println("You have " + HalfDollar + " in half dollars");

			Quarter = cents / 25;
			System.out.println("You have " + Quarter  + " in quarters");

			Dime = cents / 10;
			System.out.println("You have " + Dime + " in dimes");

			Nickel = cents / 5;
			System.out.println(" You have " + Nickel + " in nickels");

			Penny = cents /1;
			System.out.println("You have " + Penny + " in pennies");


		}

}