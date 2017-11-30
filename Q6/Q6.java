//Print all the numbers in 0 & 1001 that are not multiple of 7 or 11
//SA6
public class Q6
{
	public static void main(String [] args)
	{
		int x =0;

		for(x = 0; x <=1001 ; x++)
		{
			if((x%7 != 0) & (x%11 != 0))  //Use ""bitwise and" like in C or C++" so that it considers whole expression in IF statement
			{
				System.out.print(x + " ");
			}

		}
	}
}

