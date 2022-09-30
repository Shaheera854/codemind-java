import java.util.Scanner;
class Nonrepeated
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int c=0;
        for(int k=0;k<t;k++)
        {
            int n=sc.nextInt();
            String str=sc.next();
            for(int i=0;i<str.length();i++)
            {
                c=0;
                for(int j=0;j<str.length();j++)
                {
                    if(str.charAt(i)==str.charAt(j))
                    c++;
                }
                if(c==1)
                {
                    System.out.println(str.charAt(i));
                    break;
                }
            }
            if(c!=1)
            System.out.println("-1");
        }
    }
}