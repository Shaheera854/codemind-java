import java.util.Scanner;
class Square
{
    public static int perfect(int n)
    {
        if(Math.sqrt(n)==(int)Math.sqrt(n))
        {
            return 1;
        }
        return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,s=0;
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(perfect(arr[i])==1)
            {
                s+=arr[i];
            }
        }
        System.out.print(s);
    }
}