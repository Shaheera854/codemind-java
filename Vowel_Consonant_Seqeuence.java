import java.util.Scanner;
class Sequence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String vowels="aeiou";
        char ch=s.charAt(0);
        if(vowels.contains(String.valueOf(ch)))
        {
            System.out.print("V");
        }
        else
        {
            System.out.print("C");
        }
        for(int i=1;i<s.length();i++)
        {
            ch=s.charAt(i);
            char ch1=s.charAt(i-1);
            if(vowels.contains(String.valueOf(ch)))
            {
                if(vowels.contains(String.valueOf(ch1)))
                {
                    continue;
                }
                else
                {
                    System.out.print("V");
                }
            }
            else
            {
                if(vowels.contains(String.valueOf(ch1)))
                {
                    System.out.print("C");
                }
                else
                {
                    continue;
                }
            }
        }
    }
}