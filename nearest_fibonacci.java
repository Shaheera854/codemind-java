import java.util.Scanner;
class megaprime
{
    public static int fibi(int n)
    {
        int a=0,b=1,c=1,i;
        while(c<=n)
        {
            if(c==n)
            {
                return 1;
            }
            a=b;
            b=c;
            c=a+b;
        }
        return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d1=0,d2=0,i,s=0,l=0;
        n=sc.nextInt();
        if(fibi(n)==1)
        {
            System.out.print(n);
        }
        else
        {
            for(i=n-1;i<n;i--)
            {
                if(fibi(i)==1)
                {
                    d1=n-i;
                    s=i;
                    break;
                }
            }
            for(i=n+1;i>n;i++)
            {
                if(fibi(i)==1)
                {
                    d2=i-n;
                    l=i;
                    break;
                }
            }
            if(d1<d2)
            {
                System.out.print(s);
            }
            else if(d1==d2)
            {
                System.out.print(s+" "+l);
            }
            else
            {
                System.out.print(l);
            }
        }
    }
}