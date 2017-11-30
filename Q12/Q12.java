//SA12
import java.util.*;
public class Q12
{
        public static void main(String [] args)
        {
                //int line [] = new int [20];
                //int line2 [] = new int [20];
                int [] line = {1,3,5,7,9,3,2,4,7,8,5,6};
                int [] line2 = {1,12,15,5,15,64,78,34,9,3,9,76,54};

                int count = 0,lm;

                if(line.length < line2.length)
                lm = line.length;
                else
                lm = line2.length;

                int [] common = new int[lm];

                Arrays.sort(line);
                Arrays.sort(line2);

 //                int count = 0,lm = 0;
                int l = 0;
                for(int i = 0; i < line.length; i++)
                        for(int j = 0; j < line2.length; j++)
                                {
                                        if(i != 0)
                                        if(line[i] == line[i-1])
                                                i++;
                                        if(j!=0)
                                        if(line2[j] == line2[j-1])
                                                j++;

                                        if(line[i] == line2[j])
                                        {
                                        count++;
 //                                     System.out.print(line[i] + " ");
                                        common[l] = line[i];
                                        l++;
                                        }
                                }
                System.out.println("\nTotal count of common numbers is: " + count);
                System.out.print("Common elements are : ");
                for(l = 0; common[l] != 0; l++)
                System.out.print(common[l] + " ");

                System.out.println("\n###################################################################");
        }

}
