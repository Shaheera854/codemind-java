import java.util.Scanner;
class hcf
{
    public static int gcd(int m,int n)
    {
        int x,y,i;
        if(m<n)
        {
            x=m;
            y=n;
        }
        else
        {
            x=n;
            y=m;
        }
        i=x;
        while(i>1)
        {
            if(x%i==0 && y%i==0)
            {
                return i;
            }
            i--;
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.print(gcd(m,n));
    }
}