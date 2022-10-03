import java.util.Scanner;
class Greatest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int max=0;
            for(int j=i+1;j<n;j++)
            {
                if(max<arr[j])
                max=arr[j];
            }
            arr[i]=max;
        }
        for(int i=0;i<n-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.print("-1");
    }
}