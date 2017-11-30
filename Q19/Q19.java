import java.util.*;
public class Q19
{
	public static void main(String [] args)
	{
		String s,str;
		char b;
		int c=0,i,l,p=0,max=0;

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
						if(c>max)
							{
								max=c;
								p=i;
							}
						c=0;
					}
			}
		str=s.substring(p-max,p);
		System.out.println(str+" "+max);
	}
}