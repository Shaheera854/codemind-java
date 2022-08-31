import java.util.Scanner;
class evenarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,t=0;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2!=0)
            {
                t=1;
            }
        }
        if(t==0)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}