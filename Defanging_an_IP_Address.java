import java.util.Scanner;
class Strings
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='.')
            {
                s1+="[.]";
            }
            else
            {
                s1+=s.charAt(i);
            }
        }
        System.out.print(s1);
    }
}