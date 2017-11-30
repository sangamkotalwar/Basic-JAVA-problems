//Take continuous input of numbers until an negative integer is inputted. Print average of even and odd numbers.
//SA5
import java.util.Scanner;
public class Q5
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		int num=0,sumEven=0,countEven =0,countOdd=0;
		int sumOdd=0;
		while(true)
		{
			num = sc.nextInt();
			if(num < 0)
			break;
			if(num%2 == 0)
			{
				countEven++;
				sumEven += num;
			}
			else
			{
				countOdd++;
				sumOdd += num;
			}
		}

		sc.close();

		System.out.println("Average of odd numbers is: " + (sumOdd/countOdd));
		System.out.println("Average of even numbers is: " + (sumEven/countEven));

	}
}
