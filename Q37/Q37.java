import java.util.*;
public class Q37
{
        public static String convertIJ(String str, int i, int j)
        {
               if(i > str.length() || j > str.length() || i < 0 || j < 0)
                return "-1";
               
               if(i > j)
               {
                        int temp = i;
                        i = j;
                        j = temp;
               }
               
               String s1 = str.substring(0,i);
               String s2 = str.substring(i,j);
               String s3 = str.substring(j);
 
               String s4 = s2.substring(0,1);  //Distribute string 2 into i th charater and other string
               String s5 = s2.substring(1);
               
               String s6 = s3.substring(0,1); //Distribute string 3 into j th charater and other string
               String s7 = s3.substring(1);

               String temp = s4;                //Replace i and j th characters
               s4 = s6;
               s6 = temp;              
               
               str = s1 + s4 + s5 + s6 + s7;    //Addem
                
               return str; 
        }
        
        public static void main(String [] args)
        {
                String str;
                
                Scanner sc = new Scanner(System.in);
                
                System.out.print("Enter a string: ");
                str = sc.nextLine();
                
                System.out.print("Enter two positions to be replaced: ");
                int i = sc.nextInt();
                int j = sc.nextInt();
                
                str = convertIJ(str,i,j);
                
                if(str != "-1")
                System.out.println("Converted string is: " + str);
                else System.out.println("Length out of bound");
        }
}
