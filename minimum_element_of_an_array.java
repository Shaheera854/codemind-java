import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,min;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        min=a[0];
        for(i=1;i<n;i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }
        }
        System.out.print(min);
    }
}