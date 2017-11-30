import java.util.*;
public class Q38
{
        public static String convertDate(String str)
        {

               String [] s = new String [3];
               int i = 0;
               for(String w: str.split("/",0))
               {
               s[i] = w;
               i++;
               }

               int month = Integer.parseInt(s[1]);

               switch(month)
               {
                case 1: s[1] = "January";
                break;

                case 2: s[1] = "February";
                break;

                case 3: s[1] = "March";
                break;

                case 4: s[1] = "April";
                break;

                case 5: s[1] = "May";
                break;

                case 6: s[1] = "June";
                break;

                case 7: s[1] = "July";
                break;

                case 8: s[1] = "August";
                break;

                case 9: s[1] = "September";
                break;

                case 10: s[1] = "October";
                break;

                case 11: s[1] = "November";
                break;

                case 12: s[1] = "December";
                break;

                default : s[1] = "Invalid";
                break;
               }
               if(s[1] == "Invalid" || Integer.parseInt(s[0]) < 1 || Integer.parseInt(s[0]) > 31)
               str = "Invalid Date";
               else
               str = s[0] + " " + s[1] + " " + s[2];
               return str;
        }

        public static void main(String [] args)
        {
                String str;

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a Date (DD/MM/YYYY): ");
                str = sc.nextLine();

                str = convertDate(str);

                if(str != "-1")
                System.out.println("Converted string is: " + str);
                else System.out.println("Length out of bound");
        }
}
