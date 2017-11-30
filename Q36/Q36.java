import java.util.*;
public class Q36
{
        public static String convert(String str)
        {
    
               String s1 = str.substring(0,(str.length()-1));
               String s2 = str.substring((str.length()-1));
               System.out.println("First part of string: " + s1);
               System.out.println("last element: " + s2);
             
               s1 = s2 + s1;
                
               return s1; 
        }
        
        public static void main(String [] args)
        {
                String str;
                
                Scanner sc = new Scanner(System.in);
                
                System.out.print("Enter a string: ");
                str = sc.nextLine();
                
                str = convert(str);
                
                System.out.println("Converted string is: " + str);
        }
}
