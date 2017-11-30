//Take a number as a string check if it is octal number if yes then convert it into it's decimal counterpart.
//SA28
import java.util.*;
public class Q28
{
        public static int decOfOctal(int n)
        {
                System.out.println(n);

                int ctr = 0,temp = n,temp2 = n;
                while(temp>0)
                {
                temp %= 10;
                if(temp > 7)
                return -1;
                temp /= 10;
                }


                int decnum = 0,i=0;
                while(temp2!=0)
                {
                decnum = decnum + (temp2%10) * (int) Math.pow(8, i);
                i++;
                temp2 = temp2/10;
                }

                return decnum;
        }
        public static void main(String [] args)
        {
                Scanner sc = new Scanner(System.in);
                String s = "";
                System.out.print("Enter a number (Max. length 5): ");
                s = sc.nextLine();
                int n =0;
                if(s.length() <= 5)
                n = decOfOctal(Integer.parseInt(s));

                if(n == -1)
                System.out.println("Not a octal number");
                else System.out.println("Decimal number is :" + n);
        }
}
