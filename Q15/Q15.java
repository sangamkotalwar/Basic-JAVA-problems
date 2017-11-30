import java.util.*;
public class Q15
{
        public static void main(String [] args)
        {
                int m,lm=1;
				Scanner sc = new Scanner(System.in);
				while(lm!=0)
				{
					System.out.print("Enter a array size < 50: ");
					lm = sc.nextInt();
					if(lm <= 50 && lm > 0)
					break;
				}
                int [] a = new int[lm];

				System.out.print("Enter " + lm + " Array Elements: ");
                for(int i = 0; i < lm; i++)
				{
					a[i] = sc.nextInt();
				}

				System.out.print("Enter position to be eliminated: ");
				m = sc.nextInt() - 1;

                System.out.print("Array without element at position " + (m+1) + " is : ");
                for(int l = 0; l < lm; l++)
                {
				if(l != m)
                System.out.print(a[l] + " ");
				}
                System.out.println();
        }

}