import java.util.Scanner;

public class SecondsToMinutes
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the time in seconds: ");
		int seconds = kb.nextInt();
		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;
		System.out.println("The time in minutes is: " + minutes + ":"
		                    + remainingSeconds + " minute(s)");
	}
}
