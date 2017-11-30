//WAP to show number of days from Jan 1 to the date entered with date mentioned
//SA26
import java.util.*;
public class Q26
{
        public static boolean isLeap(int yy)
        {
                if(yy % 4 == 0)
                {
                        if( yy % 100 == 0)
                        {
                                if ( yy % 400 == 0)
                                return true;
                                else
                                return false;
                        }
                        else
                        return true;
                }
                else
            return false;
        }

        public static int findDays(int mm, int yy)
        {
                if(mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12)
                return 31;

                if(mm == 4 || mm == 6 || mm == 9 || mm == 11)
                return 30;

                if(isLeap(yy))
                return 29;
                else return 28;

        }
        public static int days(int dd, int mm, int yy)
        {
            int sum = 0;
            if(dd < 1 || dd > 31)
            return -1;

            if(mm < 1 || mm > 12)
            return -1;

            if(mm == 1)
            return dd;

            else
            for(int  i = mm-1; i > 0 ; i--)
                sum = sum + findDays(i,yy);

            sum += dd;
            return sum;
        }


        public static void main(String [] args)
        {
                int n;

                int dd,mm,yy;
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a date: ");
                dd = sc.nextInt();
                System.out.print("Enter month: ");
                mm = sc.nextInt();
                System.out.print("Enter year: ");
                yy = sc.nextInt();

                n = days(dd,mm,yy);

                if(n == -1)
                System.out.println("Invalid date");
                else
                System.out.println("Days until : " + dd + "/" + mm + "/" + yy + ":" + n);
        }
}
