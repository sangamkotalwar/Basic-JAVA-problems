import java.util.*;
public class Q25
{
	public static void main(String [] args)
	{
		int a,b,c,flag=0,lamda=0;
		double d=0;
		Scanner sc = new Scanner(System.in);

		while(flag == 0)
		{
			while(true)
			{
			System.out.print("\n1 : Quadratic Equation and finding it's roots\n2 : Exit\nPress: ");
			lamda = sc.nextInt();
			if(lamda == 2 || lamda == 1)
				break;
			}
			if(lamda == 1)
			{
				System.out.println("There is a quadratic equation ax^2 + bx + c = 0 so");
				while(d<=0)
				{
					System.out.print("Enter a, b and c [with white space in between]: ");
					a = sc.nextInt();
					b = sc.nextInt();
					c = sc.nextInt();
					d = (double) (Math.pow(b,2) - (4*a*c));
					if(d>0)
					{
						double root1 = (double) ((-b - Math.sqrt(d))/(2*a));
						double root2 = (double) ((-b + Math.sqrt(d))/(2*a));
						System.out.println("Two roots are real and distinct : " + root1 + " and " + root2);
						break;
					}
				}
			}
			else if(lamda == 2)
			break;
		}
	}
}