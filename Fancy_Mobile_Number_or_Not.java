import java.util.Scanner;
class Fancy
{
    public static int consecutive(String s)
    {
        int i;
        for(i=0;i<s.length()-2;i++)
        {
            if(s.charAt(i)==s.charAt(i+1) && s.charAt(i)==s.charAt(i+2))
            {
                return 1;
            }
        }
        return 0;
    }
    public static int order(String s)
    {
        int i;
        for(i=0;i<s.length()-2;i++)
        {
            if((int)s.charAt(i)==(int)(s.charAt(i+1))+1 && (int)s.charAt(i+1)==(int)(s.charAt(i+2))+1)
            {
                return 1;
            }
            else if((int)s.charAt(i)==(int)(s.charAt(i+1))-1 && (int)s.charAt(i+1)==(int)(s.charAt(i+2))-1)
            {
                return 1;
            }
        }
        return 0;
    }
    public static int repeat(String s)
    {
        int i,j,c;
        for(i=0;i<s.length();i++)
        {
            c=0;
            for(j=0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    c++;
                }
            }
            if(c==5)
            {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        if(s.length()!=10)
        {
            System.out.println("-1");
        }
        else
        {
            if(consecutive(s)==1 || order(s)==1 || repeat(s)==1)
            {
                System.out.println("FANCY NUMBER");
            }
            else
            {
                System.out.println("NOT A FANCY NUMBER");
            }
        }
    }
}