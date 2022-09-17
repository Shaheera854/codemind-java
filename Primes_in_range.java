import java.util.Scanner;
class count
{
    public static boolean is_prime(int n)
    {
        int i;
        if(n<2)
        {
            return false;
        }
        for(i=2;i<=(int)(Math.sqrt(n));i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=0,n=0,a,b,i,j,c=0,t=0;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a<b)
        {
            m=a;
            n=b;
        }
        else
        {
            m=b;
            n=a;
        }
        for(i=m;i<=n;i++)
        {
            if(is_prime(i))
            {
                c++;
            }
        }
        System.out.println(c);
    }
}