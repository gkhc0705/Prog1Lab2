import java.util.Scanner;

public class BMI
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter your weight in pounds: ");
		double weight = kb.nextDouble();
		System.out.print("Enter your height in feet: ");
		double height = kb.nextDouble();
		double weightKg = weight / 2.205;
		double heightM = height / 3.281;
		double bmi = weightKg / (Math.pow(heightM, 2));
		System.out.printf("\nYour weight in kg is: %.2f kg\n", weightKg);
		System.out.printf("Your height in meters is: %.2f m\n", heightM);
		System.out.printf("Your BMI is: %.2f\n", bmi);

	}
}
