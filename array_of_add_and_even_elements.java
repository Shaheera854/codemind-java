import java.util.Scanner;
class pair
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,x=0,y=0;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2==1)
            {
                System.out.print(a[i]+" ");
            }
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}