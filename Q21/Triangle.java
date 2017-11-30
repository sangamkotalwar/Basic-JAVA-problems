import static java.lang.Math.sqrt;
import static java.lang.Math.acos;
import static java.lang.Math.toDegrees;
import static java.lang.System.*;
public class Triangle
      {
		  private double side1, side2, side3;
		  private double angle1, angle2, angle3;
		  private double area, perimeter;
		  private static TwoDimPoint vertex1, vertex2, vertex3;
		  public boolean isTriangle (double side1, double side2, double side3)
		        {
					return (side1 + side2 > side3 &&
					        side2 + side3 > side1 &&
					        side3 + side1 > side2);

				}
		 public Triangle (TwoDimPoint a, TwoDimPoint b, TwoDimPoint c)
		       {
				   this (a.distanceBetween (b, c), b.distanceBetween (c, a), c.distanceBetween (a, b));
			   }
		 public Triangle ()
		       {
					side1 = side2 = side3 = 10.0;
					angle1 = getAngle (side2, side3, side1);
					angle2 = getAngle (side3, side1, side2);
					angle3 = getAngle (side1, side2, side3);
					area = getArea (side1, side2, side3);
					perimeter = getPerimeter (side1, side2, side3);
			}
		 public Triangle (double side)
		       {
					side1 = side2 = side3 = side;
					angle1 = getAngle (side2, side3, side1);
					angle2 = getAngle (side3, side1, side2);
					angle3 = getAngle (side1, side2, side3);
					area = getArea (side1, side2, side3);
					perimeter = getPerimeter (side1, side2, side3);
			   }
		 public Triangle (double sidea, double sideb)
		       {

					side1 = side2 = sidea > sideb ? sidea : sideb;
					side3 = sidea < sideb ? sidea : sideb;
					angle1 = getAngle (side2, side3, side1);
					angle2 = getAngle (side3, side1, side2);
					angle3 = getAngle (side1, side2, side3);
					area = getArea (side1, side2, side3);
					perimeter = getPerimeter (side1, side2, side3);
			}
	     public double getSide1 () {return side1;}
	     public double getSide2 () {return side2;}
	     public double getSide3 () {return side3;}
	     public double getAngle (double x, double y, double z)
	           {
				   return toDegrees (acos ((y * y + z * z - x * x) / (2 * y * z)));
			   }
	     public double getArea (double x, double y, double z)
	           {
				   double s = getPerimeter (x, y, z) / 2;
				   return sqrt (s * (s - x) * (s - y) * (s - z));
			   }
	     public double getPerimeter (double x, double y, double z)
	           {
				   return x + y + z;
			   }
	     public boolean equals (Object other)
	           {
				   if (this.getClass () != other.getClass ())
				     return false;
				   Triangle temp = (Triangle) other;
				   if (temp == null || other == null)
				     return false;
				   if (temp == other)
				     return true;
				   double tolerance = 1.0e-16;
				   if (Math.abs (this.side1 - temp.side1) < tolerance &&
				       Math.abs (this.side2 - temp.side2) < tolerance &&
				       Math.abs (this.side3 - temp.side3) < tolerance)
				     return true;
				   return false;
			   }
         public String toString ()
               {
				   return "Sides are: " + side1 +
				   ", " + side2 +
				   ", " + side3 +
				   "\nAngles are: " + angle1 +
				   ", " + angle2 +
				   ", " + angle3 +
				   ",\nArea is: " + area +
				   ", perimeter is: " + perimeter;
			   }
		 public Triangle (double sidea, double sideb, double sidec)
		       {
                   this ();
				   if (isTriangle (sidea, sideb, sidec))
				     {
				       side1 = sidea;
				       side2 = sideb;
				       side3 = sidec;
					   angle1 = getAngle (side2, side3, side1);
					   angle2 = getAngle (side3, side1, side2);
					   angle3 = getAngle (side1, side2, side3);
					   area = getArea (side1, side2, side3);
					   perimeter = getPerimeter (side1, side2, side3);
				     }
			}

          public static void main (String [] args)
              {
                 Triangle ABC = new Triangle (3, 4, 5);
                 out.println (ABC);
                 vertex1 = new TwoDimPoint (3, 4);
                 vertex2 = new TwoDimPoint (7, 12);
                 vertex3 = new TwoDimPoint (17, 22);
                 Triangle DEF = new Triangle (vertex1, vertex2, vertex3);
                 out.println (DEF);
              }
      }