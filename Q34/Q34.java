//SA34
import java.util.*;
public class Q34
{
        public static void main(String [] args)
        {
                String str;
                int flag = 1;
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a string: ");
                str = sc.nextLine();

                while(flag == 1)
                {
                for(int i = 0; i <str.length(); i++)
                {
                        char ch = str.charAt(i);

                        if(!Character.isLowerCase(ch))
                        {
                            break;
                        }

                        flag = 0;
                }

                if(flag == 0)
                {
                        char Letters [] = new char[26];
                        int NumberOfLetters [] = new int[26];

                        for(int i = 0,j=97;i<26;i++)
                        {
                                Letters[i] = (char) j;
                                j++;
                        }

                        for(int i=0;i<str.length();i++)
                        {
                                char ch = str.charAt(i);
                                for(int j = 0;j<26;j++)
                                if(ch == Letters[j])
                                {
                                        NumberOfLetters[j]++;
                                }
                        }

                        for(int i = 0; i < 26; i++)
                        System.out.print("\n" +Letters[i] + " = " + NumberOfLetters[i]);
                        System.out.println();
                }
                else
                {
                        System.out.print("Enter a string: ");
                        str = sc.nextLine();
                }
                }
        }
}
