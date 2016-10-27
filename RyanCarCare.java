import java.util.Scanner;

public class RyanCarCare
{
	public static void main(String[] args)
	{
		int tires = 0;
		int tirecost =0;
		int windshield = 0;
		int windshieldcost = 0;
		int brakes = 0;
		int total = 0;
		Scanner keys = new Scanner(System.in);

		System.out.println("Total cost for a car!");

		System.out.print("How many tires do you buy each year? ");
		tires = keys.nextInt();
		System.out.print("How much does each tire cost? ");
		tirecost = keys.nextInt();
		System.out.print("How many windsield wipers do you buy each year? ");
		windshield = keys.nextInt();
		System.out.print("How much does each windshield wiper cost? ");
		windshieldcost = keys.nextInt();
		System.out.print("How much do you spend on breaks each year? ");
		brakes = keys.nextInt();

		total = (tires * tirecost) + (windshield * windshieldcost) + brakes;
		System.out.println("The total cost of your car is $" + total);


	}

}