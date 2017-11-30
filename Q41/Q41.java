//Sum of digits in expansion of 4444^4444.
//SA41
import java.math.*;
public class Q41
{
	public static void main(String [] args)
	{
		BigInteger power = new BigInteger("1");
		BigInteger num = new BigInteger("4444");
		int j = 4444;
		int i;
		power = num.pow(4444);
		int sum = 0;
		//System.out.println(power);
		String powerString = power.toString();
		for(i=0;i<powerString.length();i++)
		{
			sum = sum + Integer.valueOf(powerString.charAt(i));
		}
		System.out.println("Sum of digits in expansion of 4444^4444 is: " + sum);
	}
}
