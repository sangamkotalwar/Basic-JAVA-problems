//Find Z = X^4 + X^3*Y + X^2*Y^2 + X*Y^3 + Y^4 using more precision [Double] in range X = [-3,4] & Y = [-5,7]
public class Lab1_Q2_findZ1
{
	public static void main (String [] args)
		{
			double x,y,max,min,temp,xmax,xmin,ymax,ymin;
				xmax=0;ymax=0;xmin=0;ymin=0;
				min = 0;max=0;

				for(x=-3;x<=4;x+=0.1)
					for(y=-5;y<=6;y+=0.1)
					{
						temp = (x*x*x*x) + (x*x*x*y) + (x*x*y*y) + (y*y*y*x) + (y*y*y*y);
						max = 0;
						if (temp > max) {
						    max = temp;
						    xmax = x;
						ymax = y;
						}

						min = 0;
						if (temp < min) {
						    min = temp;
						    ymin = y;
							xmin=x;
						}

					}

			//System.out.println(Arrays.toString(z));
			System.out.print("Maximum number is: " + max);
			System.out.print(" for x value : " + xmax);
			System.out.print(" for y value : " + ymax);
			System.out.println();
			System.out.print("Minimum number is: " + min);
			System.out.print(" for y value : " + ymin);
			System.out.print(" for x value : " + xmin);

		}
}

