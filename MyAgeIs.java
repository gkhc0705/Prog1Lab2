import java.util.Scanner;

public class MyAgeIs
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter your date of birth: ");
		int dateOfBirth = kb.nextInt();
		int currentYear = 2020;
		int age = currentYear - dateOfBirth;
		System.out.println("\nYour age is: " + age);
	}
}