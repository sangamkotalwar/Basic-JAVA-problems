//Find number of digits in expansion of 1001! and also find trailing zeroes in it.
//SA2
import java.math.BigInteger;
public class Q2
{
	public static void main(String [] args)
	{
		BigInteger factorial = new BigInteger("1");
		for(int i = 1001; i>0; i--)
		{
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}

		System.out.println("Factorial of 1001 is: " + factorial);

		String factorialString = factorial.toString();
		int numZeroes = 0;
		int j;
		for(j = factorialString.length() - 1; j > 0 ; j--)
		{
			if(factorialString.charAt(j)!='0')
				break;
			else
				numZeroes++;
		}

		System.out.println("NUmber of digits in this are: " + factorialString.length());
		System.out.println("NUmber of trailing zeroes in this are: " + numZeroes);

	}
}

