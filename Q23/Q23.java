import java.util.*;
public class Q23
{
	public static void count(String s)
	{
		int Z=0,O=0;
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == '0')
			Z++;
			else O++;
		}

		System.out.println("Number of Zeroes(0's) in string is: " + Z);
		System.out.println("Number of Ones(1's) in string is: " + O);
	}
	public static void main(String [] args)
	{
		String a="";
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		while(flag == 0)
		{
			System.out.print("Enter a string of 0's and 1's: ");
			a = sc.next();
			//System.out.println(a);
			for(int i=0; i < a.length(); i++)
			{
				if(a.charAt(i) == '0' || a.charAt(i) == '1')
					if(i == (a.length() - 1))
					flag = 1;
			}
		}

		count(a);
	}
}