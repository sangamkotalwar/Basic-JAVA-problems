//SA33
import java.util.*;
public class Q33
{

        public static void splitterInt(int n)
        {
                int flag = 1;
                int temp,ctr=0;
                Scanner sc = new Scanner(System.in);
                while(flag == 1)
                {
                        temp = n;
                        ctr = 0;
                        while(temp!=0)
                        {
                                temp = temp / 10;
                                ctr++;
                        }

                        if(ctr % 2 == 0 && ctr <= 8)
                                flag = 0;
                        else
                        {
                                System.out.print("Invalid integer lengh so Enter a integer: ");
                                n = sc.nextInt();
                        }
                }

                temp = n;
                if(flag == 0)
                {
                        int s1,s2;

                        s1 = (int)(n / Math.pow(10, ctr / 2));
                        s2 = (int)(n - s1 * Math.pow(10, ctr / 2));

                        System.out.println("First half: " + s1);
                        System.out.println("Second half: " + s2);
                }
        }

        public static void main(String [] args)
        {
                int str;

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a string of Integers: ");
                str = sc.nextInt();

                splitterInt(str);
        }

}
