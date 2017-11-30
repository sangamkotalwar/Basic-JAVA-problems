//SA332
import java.util.*;
public class Q32
{

        public static void splitter(String str)
        {
                int flag = 1;
                Scanner sc = new Scanner(System.in);
                while(flag == 1)
                {
                        if(str.length() % 2 == 0)
                        flag = 0;

                        else
                        {
                                System.out.print("Invalid string lengh so Enter a string: ");
                                str = sc.nextLine();
                        }
                }

                if(flag == 0)
                {
                        String s1 = str.substring(0,(str.length()/2));
                        String s2 = str.substring((str.length()/2));
                        System.out.println("First half: " + s1);
                        System.out.println("Second half: " + s2);
                }
        }

        public static void main(String [] args)
        {
                String str;

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a string: ");
                str = sc.nextLine();

                splitter(str);
        }

}
