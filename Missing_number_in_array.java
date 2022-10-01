import java.util.Scanner;
class Missingnumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++)
        {
            int n=sc.nextInt();
            int fl=0;
            int arr[]=new int[n-1];
            for(int i=0;i<n-1;i++)
            {
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n-1;i++)
            {
                for(int j=i+1;j<n-1;j++)
                {
                    if(arr[i]>arr[j])
                    {
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            int i;
            for(i=0;i<n-2;i++)
            {
                if(arr[i+1]!=arr[i]+1)
                {
                    System.out.println(arr[i]+1);
                    fl=1;
                    break;
                }
            }
            if(fl==0)
            {
                System.out.println(arr[i]+1);
            }
        }
    }
}