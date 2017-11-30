import java.util.*;
public class Q17
{
        public static void main(String [] args)
        {
                int lm;
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a array size: ");
				lm = sc.nextInt();
                int [] high = new int[lm];
				int j = 0,i=0;
                while(i < high.length)
				{
					if(j%2 != 0)
						{
							high[i] = j;
							j++;
							i++;
						}
					else j++;
				}

                System.out.print("Odd elements are : ");
                for(int l = 0; l < high.length; l++)
                System.out.print(high[l] + " ");

                System.out.println();
        }

}