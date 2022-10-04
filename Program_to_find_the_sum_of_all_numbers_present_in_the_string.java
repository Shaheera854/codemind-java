import java.util.Scanner;
class Strings
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int sum=0,n;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                n=ch-'0';
                sum+=n;
            }
        }
        System.out.println(sum);
        
    }
}