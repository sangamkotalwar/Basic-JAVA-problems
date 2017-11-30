import java.util.*;
public class Q22
{
	public static int [] sort (int [] a)
	{
		//int lm = a.length;
		//int [] b = int [lm];
		int temp;
		for(int i = 0; i < a.length; i++)
			for(int j = 1; j < a.length; j++)
				if(a[j-1] < a[j])
				{
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
		return a;
	}
	public static void main(String [] args)
	{
		int [] a = new int [50];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 50 elements: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		int [] b = sort(a);
		for(int i = 0; i< b.length; i++)
		System.out.print(b[i] + " ");
	}
}