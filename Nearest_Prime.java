import java.util.Scanner;
class megaprime
{
    public static int is_prime(int n)
    {
        int i;
        if(n==0 || n==1)
        {
            return 0;
        }
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d1=0,d2=0,i,s=0,l=0,t,j;
        t=sc.nextInt();
        for(j=0;j<t;j++)
        {
            n=sc.nextInt();
            if(is_prime(n)==1)
            { 
                System.out.println(n);
            }
            else
            {
                for(i=n-1;i<n;i--)
                {
                    if(is_prime(i)==1)
                    {
                        d1=n-i;
                        s=i;
                        break;
                    }
                }
                for(i=n+1;i>n;i++)
                {
                    if(is_prime(i)==1)
                    {
                        d2=i-n;
                        l=i;
                        break;
                    }
                }
                if(d1<=d2)
                {
                    System.out.println(s);
                }
                else
                {
                    System.out.println(l);
                }
            }
        }
    }
}