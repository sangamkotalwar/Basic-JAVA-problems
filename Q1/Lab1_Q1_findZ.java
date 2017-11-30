//Find Z = X^4 + X^3*Y + X^2*Y^2 + X*Y^3 + Y^4 considering[Integer] in range X = [-3,4] & Y = [-5,7]
//SA1
import java.util.Arrays;
public class Lab1_Q1_findZ
{
	public static void main (String [] args)
		{
			int z[] = new int[96];
			int x,y,i;
			i = 95;
				while(i>-1)
				for(x=-3;x<5;x++)
					for(y=-5;y<7;y++)
					{
						z[i] = (x*x*x*x) + (x*x*x*y) + (x*x*y*y) + (y*y*y*x) + (y*y*y*y);
						i--;
					}
					Arrays.sort(z);
			System.out.println(Arrays.toString(z));
			System.out.println("Maximum number is: " + z[95]);
			System.out.println("Minimum number is: " +z[0]);
		}
}

