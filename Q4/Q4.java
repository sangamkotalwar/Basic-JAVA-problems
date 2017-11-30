import java.util.*;
public class Q4
{
	public static void main(String [] args)
	{
		Double z;
		System.out.print("Enter a Decimal: ");
		Scanner sc = new Scanner(System.in);
		z = sc.nextDouble();
		String string_temp = z.toString();
		String string_form_before = string_temp.substring(0,string_temp.indexOf('.'));
		double b = Double.valueOf(string_form_before);
		System.out.println("Before decimal: " + b);
		String string_form_after = string_temp.substring(string_temp.indexOf('.'), string_temp.length());
		double a = Double.valueOf(string_form_after);
		System.out.println("After decimal: " + a);

		if(a > 0.5)
		System.out.println(a + " is greater than 0.5");
		else if(a == 0.5)
		System.out.println(a + " is equal to 0.5");
		else System.out.println(a + " is lesser than 0.5");
	}
}