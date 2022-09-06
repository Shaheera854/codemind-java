import java.util.Scanner;
class megaprime
{
    public static int is_prime(int n)
    {
        int i;
        if(n==0)
        {
            return 0;
        }
        if(n==1)
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
        int n,d1=0,d2=0,i;
        n=sc.nextInt();
        if(is_prime(n)==1)
        {
            System.out.print("0");
        }
        else
        {
            for(i=n-1;i<n;i--)
            {
                if(is_prime(i)==1)
                {
                    d1=n-i;
                    break;
                }
            }
            for(i=n+1;i>n;i++)
            {
                if(is_prime(i)==1)
                {
                    d2=i-n;
                    break;
                }
            }
            if(d1<d2)
            {
                System.out.print(d1);
            }
            else
            {
                System.out.print(d2);
            }
        }
    }
}