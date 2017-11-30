import java.util.Scanner;
public class Q11
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		int num=0,sumEven=0,countEven =0,countOdd=0,largest=0,smallest=1589555;
		int sumOdd=0;
		while(true)
		{
			num = sc.nextInt();
			if(num < 0)
			break;
			if(largest<num)
				largest = num;

			if(smallest>num)
				smallest = num;

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

		System.out.println("Largest of all numbers is: " + largest);
		System.out.println("Smallest of all numbers is: " + smallest);
		System.out.println("Average of odd numbers is: " + (sumOdd/countOdd));
		System.out.println("Average of even numbers is: " + (sumEven/countEven));

	}
}
