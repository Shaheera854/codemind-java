import java.util.Scanner;
class kth
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,i,s=0;
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            s+=arr[i];
            if(arr[i]==k)
            {
                System.out.println(s);
                break;
            }
        }
    }
}