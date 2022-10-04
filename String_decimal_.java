import java.util.Scanner;
class Strings
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int fl=0;
            String s=sc.next();
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)<'0' || s.charAt(i)>'9')
                {
                    fl=1;
                    System.out.println("False");
                    break;
                }
            }
            if(fl==0)
            {
                System.out.println("True");
            }
        }
    }
}