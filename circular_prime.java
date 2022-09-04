import java.util.Scanner;
class circular
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
        int n,rev,temp;
        n=sc.nextInt();
        if(is_prime(n)==1)
        {
            temp=n;
            rev=0;
            while(temp!=0)
            {
                rev=rev*10+temp%10;
                temp/=10;
            }
            if(is_prime(rev)==1)
            {
                System.out.print("circular prime");
            }
            else
            {
                System.out.print("prime but not a circular prime");
            }
        }
        else
        {
            System.out.print("not prime");
        }
    }
}