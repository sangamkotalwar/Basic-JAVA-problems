import java.util.*;
import java.io.*;
public class Q9
{
	public static void main(String [] args) throws Exception
	{
		File file =  new File("Marks.dat");
		Scanner input = new Scanner(file);
		int A=0,B=0,C=0,D=0,F=0,Marks=0;

		while(input.hasNextLine())
		{
			String ch = input.nextLine();
			System.out.println(ch);

			Marks = Integer.parseInt(ch);
			if(Marks >= 90)
			A++;
			else if(Marks >= 80 && Marks < 90)
			B++;
			else if(Marks >= 65 && Marks < 80)
			C++;
			else if(Marks >= 50 && Marks < 65)
			D++;
			else if(Marks < 50)
			F++;
		}

		System.out.println("Number of Students receiving grade A is: " + A);
		System.out.println("Number of Students receiving grade B is: " + B);
		System.out.println("Number of Students receiving grade C is: " + C);
		System.out.println("Number of Students receiving grade D is: " + D);
		System.out.println("Number of Students receiving grade F is: " + F);

		int total = A + B + C + D + F;
		double PA = (double)A/(double)total*100;
		double PB = (double)B/(double)total*100;
		double PC = (double)C/(double)total*100;
		double PD = (double)D/(double)total*100;
		double PF = (double)F/(double)total*100;
		System.out.println("% of Students receiving grade A is: " + PA + "%");
		System.out.println("% of Students receiving grade B is: " + PB + "%");
		System.out.println("% of Students receiving grade C is: " + PC + "%");
		System.out.println("% of Students receiving grade D is: " + PD + "%");
		System.out.println("% of Students receiving grade F is: " + PF + "%");
		input.close();
	}
}