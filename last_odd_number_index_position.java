import java.util.Scanner;
class index
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,ind=0;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2!=0)
            {
                ind=i;
            }
        }
        System.out.print(ind);
    }
}