import java.util.Scanner;
class pair
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<(n/2);i++)
        {
            System.out.print(arr[i]+" ");
            System.out.print(arr[n-i-1]+" ");
        }
        if(n%2==1)
        {
            System.out.print(arr[i]+" 0");
        }
    }
}