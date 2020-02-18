import java.util.Scanner;

public class AverageTemp
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the temperature on the first day in Celsius: ");
		int t1 = kb.nextInt();
		System.out.print("Enter the temperature on the second day in Celsius: ");
		int t2 = kb.nextInt();
		System.out.print("Enter the temperature on the third day in Celsius: ");
		int t3 = kb.nextInt();
		int avgTemp = (t1 + t2 + t3) / 3;
		System.out.println("\nThe average temperature of past 3 days is: " + avgTemp + " C");
	}
}