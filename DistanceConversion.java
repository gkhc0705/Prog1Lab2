import java.util.Scanner;

public class DistanceConversion
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the distance in meters: ");
		int meters = kb.nextInt();
	    double feet = meters * 3.281;
		System.out.printf("\nThe distance in feet is: %.2f\n", feet);
	}
}
