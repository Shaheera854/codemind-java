import java.util.Scanner;
class primes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,s=0,j,c=0,t;
        float avg;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==1)
            {
                continue;
            }
            else
            {
                t=0;
                for(j=2;j<(a[i]/2)+1;j++)
                {
                    if(a[i]%j==0)
                    {
                        t=1;
                        break;
                    }
                }
                if(t==0)
                {
                   c++; 
                }
            }
        }
        System.out.print(c);
    }
    
}