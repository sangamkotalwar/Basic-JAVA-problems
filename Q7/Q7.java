import java.util.*;
public class Q7
{
	public static void main(String [] args)
	{
		int a,b,c,d,e,f;
		Scanner sc = new Scanner(System.in);

		System.out.println("Two lines are of the form ax + by = c & dx + ey = f so: ");
		System.out.print("Enter a, b and c [with white space in between]: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		System.out.print("Enter d, e and f [with white space in between]: ");
		d = sc.nextInt();
		e = sc.nextInt();
		f = sc.nextInt();

		double m1, m2;

		m1 = (double) -a/b;
		System.out.println("Slope of line 1 is: " + m1);
		m2 = (double) -d/e;
		System.out.println("Slope of line 2 is: " + m2);

		if(m1 == m2)
		System.out.println("Lines are parallel");
		else if( m1 * m2 == -1.0s)
		{
					int m,n,o;
					m = -a*d;
					n = -a*e;
					o = -a*f;

					int g,h,i;
					g = d*a;
					h = d*b;
					i = d*c;

					double y = (double) ((o+i)/(n+h));
					double x = (double) ((c - (b*y))/a);

					System.out.println("Lines are perpendicular and intersecting at: " + "(" + x + " , " + y + ").");
		}
		else
		{
			int m,n,o;
			m = -a*d;
			n = -a*e;
			o = -a*f;

			int g,h,i;
			g = d*a;
			h = d*b;
			i = d*c;

			double y = (double) ((o+i)/(n+h));
			double x = (double) ((c - (b*y))/a);

			System.out.println("Lines are intersecting at: " + "(" + x + " , " + y + ").");
		}
	}
}