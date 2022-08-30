import java.util.Scanner;
class min
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,b,i,j,t;
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        a=sc.nextInt();
        b=sc.nextInt();
        t=0;
        for(i=0;i<n;i++)
        {
            for(j=a;j<=b;j++)
            {
                if(arr[i]==j)
                {
                    System.out.print(j+" ");
                    t=1;
                }
            }
        }
        if(t==0)
        {
            System.out.println("-1");
        }
    }
}