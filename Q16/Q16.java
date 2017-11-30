//Encode a string from "a -> b" "b -> c" and so on.
//SA16
import java.util.*;
public class Encoding
{
        public static void main(String [] args)
        {
                Scanner sc = new Scanner(System.in);
                boolean flag = true;
                String s;
                s = "";
                System.out.print("Enter a string: ");
                s = sc.nextLine();
                s = s.toLowerCase();
                flag = false;

                String str = "";
                for(int i = 0; i <s.length() ; i++)
                {
                        if(s.charAt(i) == ' ')
                        {
                        i++;
                        str = str + " ";
                        }
                        int temp = (int) s.charAt(i);
                        temp++;

                        if(temp == 122)
                        temp = 97;

                        str = str + (char) temp;
                }

                System.out.println("Encoded string is: " + str);
        }
}

