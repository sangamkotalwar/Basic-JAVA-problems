//SA14
import java.util.Arrays;
import java.util.*;
public class Seclar
{
       public static void main(String [] args)
       {
                int line[];
                int howMany;
                Scanner kbd = new Scanner(System.in);
                System.out.print("Enter how many numbers in an array: ");
                howMany = kbd.nextInt();
                line = new int[howMany];

                System.out.println("Enter numbers: ");
                for(int i = 0; i< howMany; i++)
                line[i] = kbd.nextInt();

                Arrays.sort(line);

                System.out.println("Second largest element is : " + line[howMany - 2]);

       }
}
