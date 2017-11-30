import java.util.Scanner;
public class Q18
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		double num=0.0,largest=0.0,smallest=15885555,sum=0.0;
		int count = 0;
		System.out.print("Stop with a negative number: ");
		while(true)
		{
			num = sc.nextDouble();
			if(num < 0)
			break;
			if(largest<num)
				largest = num;

			if(smallest>num)
				smallest = num;

			sum += num;
			count++;
		}

		sc.close();

		System.out.println("Largest of all numbers is: " + largest);
		System.out.println("Smallest of all numbers is: " + smallest);
		System.out.println("Average of all numbers is: " + (double)sum/count);
	}
}
