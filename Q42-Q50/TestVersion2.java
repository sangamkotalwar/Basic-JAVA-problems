import java.util.*;
import java.math.*;
public class TestVersion2

      {



         public static void main (String [] args)

               {

                  int x = 5;

                  x += 3.7;

                  System.out.println (x);

                  int n = 27; // 11011 in binary

					System.out.println ((n & (1 << 3)) >> 3);
					int y = 1;
					//System.out.println(y << 3);
					System.out.println (3 & 4);
					System.out.println (3 | 4);
					System.out.println (~ 3);
					System.out.println (3 ^ 4);
					float f = 1.2f;

					Integer z = new Integer(5);
					System.out.println(z);

					//BigInteger a = new BigInteger (51234);
					BigInteger b = new BigInteger ("5567");
					BigDecimal c = new BigDecimal (1234);
					BigDecimal d = new BigDecimal ("1234");

					Integer e = 5;
					Integer r = 5;
					System.out.println(e == r);
					System.out.println(e.equals(r));

					//final int a = 20;
					//a++;
               }

      }