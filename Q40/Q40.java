public class Q40
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
}