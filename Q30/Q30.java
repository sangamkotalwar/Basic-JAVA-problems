import java.util.*;
public class Q30
{
	public static int decimalValue (int [] a)
	{
		int tempSum=0,j=0;
		for(int i = a.length - 1; i >= 0; i--)
			{
				tempSum += a[i]*Math.pow(2,j);
				j++;
			}

		return tempSum;
	}
	public static void main(String [] args)
	{
		int [] a = new int [20];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a binary number with 20 digits[All digits with a white space between them]: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		//System.out.println("Binary is" + a);
		int d = decimalValue(a);

		System.out.print("Decimal value of above binary number is: " + d);
	}
}