import java.util.Scanner;
class Pretty
{
    public static int pretty(int n)
    {
        if(n%10==2 || n%10==3 || n%10==9)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,l,r,i,c;
        t=sc.nextInt();
        for(i=0;i<t;i++)
        {
            c=0;
            l=sc.nextInt();
            r=sc.nextInt();
            while(l<=r)
            {
                if(pretty(l)==1)
                {
                    c++;
                }
                l++;
            }
            System.out.println(c);
        }
        
    }
}