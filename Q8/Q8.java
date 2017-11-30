import java.util.*;
public class Q8
{
	public static void main(String [] args)
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);

		System.out.println("There is a quadratic equation ax^2 + bx + c = 0 so");
		System.out.print("Enter a, b and c [with white space in between]: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		double d;

		d = (double) (Math.pow(b,2) - (4*a*c));
		System.out.println("Value of d is: " + d);

		if(d == 0.0)
		{
			double root1 = (double) -b/(2*a);
			System.out.println("Two roots are real and equal : " + root1);
		}
		else if( d > 0)
		{
			double root1 = (double) ((-b - Math.sqrt(d))/(2*a));
			double root2 = (double) ((-b + Math.sqrt(d))/(2*a));
			System.out.println("Two roots are real and distinct : " + root1 + " and " + root2);
		}
		else
		{
			double roota = (double) -b/(2*a);
			double rootb = (double) (Math.sqrt(-d)/(2*a));
			String root1 = roota + " + " + rootb + "i";
			String root2 = roota + " - " + rootb + "i";
			System.out.println("Two roots are imaginary and distinct : " + root1 + " and " + root2);
		}
	}
}