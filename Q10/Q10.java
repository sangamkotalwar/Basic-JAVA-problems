public class Q10
{

	public static void CompoundInterest(double P, double r, int T)
	{
		
		for(int i = 1; i <= T ; i++)
		{
		
			double A;
			A = Math.pow((1+r),i);
			double Px;
			Px = A*P;
			double X;
			X = Px - P;
			System.out.println("Compound Interest for year " + i + " is: " + X);
		}	
	
	}

	public static void main(String [] args)
	{
		double P = 52500;
		double r = 0.085;
		int T = 10;
		
		CompoundInterest(P,r,T);
	}
}
