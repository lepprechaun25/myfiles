/* CellPhoneBill.java
Programmer: Ryan Dross
Date: 10/27/16
Version 1.0
*/
import java.util.Scanner;

public class RyanCellPhoneBill
{

	public static void main(String[] args)
		{
			Scanner keys = new Scanner(System.in);

			double Daymin = 0;
			double Nightmin = 0;
			double Dayrem = 0;
			double anytime = 0;
			double dayaddmin = 0;
			double nightaddmin = 0;
			double addmin = 0;
			double connmin = 0;
			double tax = 0.05;
			double scam = 0;
			double subtotal = 0;
			double total = 0;



			System.out.println("Billing Statement ");
			System.out.println("Daytime Minutes ");
			Daymin = keys.nextDouble();
			System.out.println("Nighttime Minutes ");
			Nightmin = keys.nextDouble();

			if(Daymin > 400)
			{
				Dayrem = Daymin - 400;
			}
			else
			{
				Nightmin = Nightmin + Daymin - Dayrem;
			}
			anytime = 49.99;
			dayaddmin = Dayrem * 0.5;
			nightaddmin = Nightmin * 0.1;
			addmin = dayaddmin + nightaddmin;
			connmin = (Daymin * 0.03) + (Nightmin * 0.03);

			subtotal = anytime + addmin + connmin;
			scam = subtotal * tax;
			total = subtotal + scam;
			System.out.println("Basic Service > $49.99 ");
			System.out.println("Additonal minutes " + addmin);
			System.out.println("Connection Fees " + connmin);
			System.out.println("Subtotal " + subtotal);
			System.out.println("Scam Tax " + scam);
			System.out.println("Total " + total);
		}

}