//Take a number as a string check if it is hexa decimal number if yes then convert it into it's decimal counterpart.
//SA29
import java.util.*;
public class Q29
{
        public static int decOfHexDec(String s)
        {
                int i=0,sum = 0,newnum = 0;

				for(i=0;i<s.length();i++)
				    {
				        char c = s.charAt(s.length()-i-1);

				        if(c=='A')
				        {
				            newnum = 10;

				        }
				        else if(c=='B')
				        {
				            newnum = 11;

				        }
				        if(c=='C')
				        {
				            newnum = 12;

				        }
				        if(c=='D')
				        {
				            newnum = 13;

				        }
				        if(c=='E')
				        {
				            newnum = 14;

				        }
				        if(c=='F')
				        {
				            newnum = 15;

				        }
				        else
				        {
				            newnum = Character.getNumericValue(c);
				        }
        			sum = (int) (sum + newnum*Math.pow(16,i));

					}

                return sum;
        }
        public static void main(String [] args)
        {
                Scanner sc = new Scanner(System.in);
                String s = "";
                System.out.print("Enter a number (Max. length 5): ");
                s = sc.nextLine();
                int n =0;
                if(s.length() <= 5)
                n = decOfHexDec(s);
				else System.out.println("Invalid Number : length not more than 5");
                if(n == -1)
                System.out.println("Not a hexadecimal number");
                else System.out.println("Decimal number is :" + n);
        }
}
