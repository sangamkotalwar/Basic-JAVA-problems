//Q27 of standing assignment
import java.util.*;
public class Q27
{
        public static void doIt(int n)
        {
                String s = "";

                switch(n)
                {
                case 1 : s = "One";
                break;

                case 2 : s = "Two";
                break;

                case 3 : s = "Three";
                break;

                case 4 : s = "Four";
                break;

                case 5 : s = "Five";
                break;

                case 6 : s = "Six";
                break;

                case 7 : s = "Seven";
                break;

                case 8 : s = "Eight";
                break;

                case 9 : s = "Nine";
                break;

                default : s = "Zero";
                break;
                }

                int sum = 0;
                for(int i = n; i > 0; i--)
                sum += i;

                System.out.println("You entered: " + s + " with sum as: " + sum);
        }

        public static void main(String [] args)
        {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter a digit: ");
        n =  sc.nextInt();

        int ctr = 0,temp = n;
        while(temp>0) {
        temp /= 10;
        ctr++;
        }

        if(ctr != 1)
        System.out.println("Invalid Number : Input single digit number");
        else  doIt(n);
        }

}
