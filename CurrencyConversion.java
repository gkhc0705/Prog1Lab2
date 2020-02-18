import java.util.Scanner;

public class CurrencyConversion
{
	public static void main(String[] args)
	{

	Scanner kb = new Scanner(System.in);
	System.out.print("Enter amount in CAD: ");
	double canadianDollar = kb.nextInt();
	double usDollar = canadianDollar * 0.75;
	double euro = canadianDollar * 0.68;
	System.out.printf("\nThe amount in USD is: %.2f\n", usDollar);
	System.out.printf("The amount in Euro is: %.2f\n", euro);

    }
}
