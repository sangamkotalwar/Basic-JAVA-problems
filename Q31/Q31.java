import java.util.*;
public class Q31
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

	public static String octalValue (int dec)
	{
		String octalString = Integer.toOctalString(dec);
		return octalString;
	}
	public static String hexaDecimalValue (int dec)
	{
			String str = Integer.toHexString(dec);
			return str;
	}
	public static void main(String [] args)
	{
		int [] a = new int [4];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a binary number with 4 digits[All digits with a white space between them]: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		//System.out.println("Binary is" + a);
		int d = decimalValue(a);
		String o = octalValue(d);
		String h = hexaDecimalValue(d);
		System.out.println("Decimal value of above binary number is: " + d);
		System.out.println("Octal value of above binary number is: " + o);
		System.out.println("Hexadecimal value of above binary number is: " + h);
	}
}