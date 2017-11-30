import java.util.*;
public class Q13
{
        public static void main(String [] args)
        {
                int [] line = {1,3,5,7,9,3,2,4,7,8,5,6};
                int [] line2 = {1,12,15,5,15,64,78,34,9,3,9,76,54};

                int count = 0,lm;
                lm = line.length + line2.length;
                int [] high = new int[lm];

                int j = 0,k = 0;
                for(int i = 0; i < high.length; i++)
                        {
							if(i%2 == 0)
							{
								if(j < line.length)
								{
									high[i] = line[j];
									j++;
								}
							}
							else
							{
								if(k < line2.length)
								{
									high[i] = line2[k];
									k++;
								}
							}
						}
                System.out.print("Mixture of alternate elements are : ");
                for(int l = 0; l < high.length; l++)
                System.out.print(high[l] + " ");

                System.out.println("\n###################################################################");
        }

}