import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,i,j,temp,c,t,count=0;
        n=sc.nextInt();
        m=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c=0;
            for(j=i;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
            if(c>1)
            {
                temp=a[i];
                a[i]=a[n-1];
                a[n-1]=temp;
                n--;
                i--;
            }
        }
        for(i=0;i<m;i++)
        {
            c=0;
            for(j=i;j<m;j++)
            {
                if(b[i]==b[j])
                {
                    c++;
                }
            }
            if(c>1)
            {
                temp=b[i];
                b[i]=b[m-1];
                b[m-1]=temp;
                m--;
                i--;
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(a[i]==b[j])
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}