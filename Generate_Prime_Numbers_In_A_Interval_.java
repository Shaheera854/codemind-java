import java.util.Scanner;
class count
{
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
            if(i!=1 && i!=0)
            {
                t=0;
                for(j=2;j<=i/2;j++)
                {
                    if(i%j==0)
                    {
                        t=1;
                        break;
                    }
                }
                if(t==0)
                {
                    System.out.println(i);
                }
            }
        }
    }
}