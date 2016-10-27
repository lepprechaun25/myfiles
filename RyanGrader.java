import java.util.Scanner;

public class RyanGrader
{

	public static void main(String[] args)
		{
			int exam1 = 0;
			int exam2 = 0;
			int exam3 = 0;
			int exam4 = 0;
			int exam5 = 0;
			int total = 0;
			double average1 = 0;
			double average2 = 0;
			Scanner keys = new Scanner(System.in);


			System.out.println("Enter Grade for Exam 1");
			exam1 = keys.nextInt();
			System.out.println("Enter Grade for Exam 2");
			exam2 = keys.nextInt();
			System.out.println("Enter Grade for Exam 3");
			exam3 = keys.nextInt();
			System.out.println("Enter Grade for Exam 4");
			exam4 = keys.nextInt();
			System.out.println("Enter Grade for Exam 5");
			exam5 = keys.nextInt();

			total = exam1 + exam2 + exam3 + exam4 + exam5;
			average1 = total / 5;
			average2 = total / 5;

				if (average1 > 90 && average2 > 90)
					{
						System.out.println("Your average is an A");
					}
				if (average1 < 90 && average2 > 80)
					{
						System.out.println("Your Average is a B");
					}
				if (average1 < 80 && average2 > 70)
					{
						System.out.println("Your Average is a C");
					}
				if (average1 < 70 && average2 > 60)
					{
						System.out.println("Your Average is a D");
					}
				if (average1 < 60 && average2 < 60)
					{
						System.out.println("Your Average is an F");
					}

		}

}