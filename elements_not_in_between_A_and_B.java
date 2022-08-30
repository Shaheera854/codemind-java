import java.util.Scanner;
class kth
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,s=0,j,c,a,b,t;
        float avg;
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=0;i<n;i++)
        {
            t=0;
            for(j=a;j<=b;j++)
            {
                if(arr[i]==j)
                {
                    t=1;
                    break;
                }
            }
            if(t==0)
            {
                System.out.print(arr[i]+" ");
                s=1;
            }
        }
        if(s==0)
        {
            System.out.println("-1");
        }
    }
}