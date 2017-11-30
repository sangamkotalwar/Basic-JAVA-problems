import java.util.*;
import java.io.*;

public class Q39
{
    public static void main (String[] args)
    {
        String month;
        String day;
        String inputYear;
            Scanner  keyboard = new Scanner(System.in);

                System.out.print( " \n \n Please Enter The Month Of The Date [String]:");
                month = keyboard.nextLine();

                System.out.print( " \n Please Enter The Day Of The Date [Number]: ");
                day = keyboard.nextLine();
				if(Integer.parseInt(day) > 31 || Integer.parseInt(day) <=0)
				{
					System.out.println("Invalid day");
					System.exit(0);
				}
				if(month.toLowerCase() == "february")
					if(Integer.parseInt(day) > 29)
					{
						System.out.println("Invalid day");
						System.exit(0);
					}
                System.out.print( " \n Please Enter The Year OF The Date [Number]: ");
                inputYear = keyboard.nextLine();
                String stringYear = ""+ inputYear.charAt(inputYear.length()-2) + inputYear.charAt(inputYear.length()-1);
                int year = Integer.parseInt(stringYear);
                int intDay = Integer.parseInt(day);

        switch(month.toLowerCase())
        {

            case "january" :
            int janKey = 1;
            results (day , inputYear, month, year, intDay, janKey);
            break;


            case "february":
            int febKey = 4;
            results (day , inputYear, month, year, intDay, febKey);
            break;


            case "march":
            int marKey = 4;
            results (day , inputYear, month, year, intDay, marKey);
            break;


            case "april":
            int aprKey = 0;
            results (day , inputYear, month, year, intDay, aprKey);
            break;

            case "may":
            int maykey = 2;
            results (day , inputYear, month, year, intDay, maykey);
            break;

            case "june":
            int junKey = 5;
            results (day , inputYear, month, year, intDay, junKey);
            break;

            case "july":
            int julKey = 0;
            results (day , inputYear, month, year, intDay, julKey);
            break;

            case "august":
            int augKey = 3;
            results (day , inputYear, month, year, intDay, augKey);
            break;

            case "september":
            int septKey = 6;
            results (day , inputYear, month, year, intDay, septKey);
            break;

            case "october":
            int octKey = 1;
            results (day , inputYear, month, year, intDay, octKey);
            break;

            case "november":
            int novKey = 4;
            results (day , inputYear, month, year, intDay, novKey);
            break;

            case "december":
            int decKey = 4;
            results (day , inputYear, month, year, intDay, decKey);
            break;

            default:
            System.out.println(" Invalid Entry Please Try Again " );

        }
}

public static void results ( String day , String inputYear, String month, int year, int intDay, int key )
{
    int quarter = year / 4;
    int sum = year + quarter + intDay + key;

            System.out.println(" \n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("*********************************************************************** ");
            System.out.println("***********************    Result    ********************************** ");
            System.out.println("*********************************************************************** ");
            System.out.println( " \n\n\t\t Date Entered Was : " );
            System.out.println(" \n \t \t   " + month + "  "+ day + " , " + inputYear );
            System.out.println( " \n\n Last Two Digits Of The Year Were : ........ " + year);
            System.out.println( " \n One Quarter Of Last Two Digits : ........ " + quarter);
            System.out.println( " \n The Given Day Of The Month Entered : ........ " + day);
            System.out.println( " \n The Index Key Of This Month : ........ " + key);
            System.out.println( " \n The Sum Of All The Numbers Above Is : ........ " + sum);
            dayLookUp(sum);
            String weekDay = dayLookUp(sum);
            System.out.println( " \n \n \t The Day Of The Week Was : ........ " + weekDay);
}

public static String dayLookUp ( int sum )
{
    String weekDay;
    String error = " \n \n Please Check Your Dates And Try Again " ;
    int day = sum % 7;

    switch(day)
        {

            case 1 :
            weekDay = " Sunday ";
            return weekDay;

            case 2:
            weekDay = " Monday ";
            return weekDay;

            case 3:
            weekDay = " Tuesday ";
            return weekDay;

            case 4:
            weekDay = " Wednesday ";
            return weekDay;

            case 5:
            weekDay = " Thursday ";
            return weekDay;

            case 6:
            weekDay = " Friday ";
            return weekDay;

            case 7:
            weekDay = " Saturday ";
            return weekDay;

            default:
            System.out.println(" Invalid Entry Please Try Again " );
            return error;
        }
    }
}