public class TwoDimPnt
      {
          private double x, y;
          public TwoDimPnt ()
                {
					x = 0.0;
					y = 0.0;
				}
          public TwoDimPnt (double coOrd)
                {
					x = coOrd;
					y = coOrd;
				}
          public TwoDimPnt (double x, double y)
                {
					this.x = x;
					this.y = y;
				}
          public String toString ()
		        {
					return "(" + x + ", " + y + ")";
				}
		  public boolean equals (Object other)
		        {
					double tolerance = 1.0e-16;
					if (this == other)
					  return true;
					if (this != null && other != null)
					  if (this.getClass () == other.getClass ())
					    {
							TwoDimPnt temp = (TwoDimPnt) other;
							if (Math.abs (this.x - temp.x) < tolerance && Math.abs (this.y - temp.y) < tolerance)
							  return true;
						}
			       return false;
				}
		  public void translateTo (TwoDimPnt other)
		        {
					this.x = other.x;
					this.y = other.y;
				}
          public double distanceTo (TwoDimPnt other)
                {
					return (Math.sqrt ((this.x - other.x) * (this.x - other.x) + (this.y - other.y) * (this.y - other.y)));
				}
          public static void main (String [] args)
                {
					TwoDimPnt A = new TwoDimPnt (3, 4);
					TwoDimPnt B = new TwoDimPnt (6, 8);
					TwoDimPnt C = new TwoDimPnt (6.000000000000000000001, 8.00000000000000000000000001);
					System.out.println (A.distanceTo (B));
					System.out.println (A);
					System.out.println (B);
					A.translateTo (B);
					System.out.println (A);
					System.out.println (B.equals (C));

				}

      }
