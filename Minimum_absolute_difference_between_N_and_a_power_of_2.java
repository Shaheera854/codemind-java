import java.util.Scanner;
class megaprime
{
    public static int is_power(int n)
    {
        int i;
        for(i=0;i<n;i++)
        {
            if(Math.pow(2,i)==n)
            {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d1=0,d2=0,i;
        n=sc.nextInt();
        if(is_power(n)==1)
        {
            System.out.print("0");
        }
        else
        {
            for(i=n-1;i<n;i--)
            {
                if(is_power(i)==1)
                {
                    d1=n-i;
                    break;
                }
            }
            for(i=n+1;i>n;i++)
            {
                if(is_power(i)==1)
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