import java.util.Scanner;

public class SystemBuilder
{
	public static void main(String[] args)
		{
			double q1 = 0;
			double q2 = 0;
			double q3 = 0;
			double q4 = 0;
			double q5 = 0;
			double total = 0;

			double comp = 1000;
			double network = 49.95;
			double switches = 78.30;
			double cables = 12.98;
			double flux = 765.99;
			double tax = 4.2;
			Scanner keys = new Scanner(System.in);

			System.out.println("Hi Thanks for Choosing System Builder!");
			System.out.println("We really care about your money!");

			System.out.println("How many computers would you like today?");
			q1 = keys.nextDouble();
			System.out.println("How many network cards would you like today?");
			q2 = keys.nextDouble();
			System.out.println("How many swtiches would you like today?");
			q3 = keys.nextDouble();
			System.out.println("How many cables would you like today?");
			q4 = keys.nextDouble();
			System.out.println("How many flux capacitors would you like today?");
			q5 = keys.nextDouble();

			total = (q1 * comp) + (q2 * network) + (q3 * switches) + (q4 * cables) + (q5 * flux) / tax;

			System.out.println("Your total comes to $" + total);
		}
}