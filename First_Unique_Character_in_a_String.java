import java.util.Scanner;
class Strings
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int t=0;
        for(int i=0;i<s.length();i++)
        {
            int c=0;
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                c++;
            }
            if(c==1)
            {
                System.out.println(i);
                t=1;
                break;
            }
        }
        if(t==0)
        System.out.println("-1");
    }
}