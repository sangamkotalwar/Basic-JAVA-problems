import java.util.*;
public class Q24
{
	public static void main(String [] args)
	{
		String s,str="";
		char b;
		int c=0,i,l,p=0;
		String max;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		s=sc.nextLine();

		s=s.concat(" ");
		l=s.length();
		for(i=0;i<l;i++)
			{
				b=s.charAt(i);
				if(b!=' ')
					{
						c=c+1;
					}
				else
					{
						max = Integer.toString(c);
						str = str.concat(max);
						c = 0;
					}
			}

		System.out.println(str);
	}
}