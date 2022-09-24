import java.util.Scanner;
class Max
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,temp;
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[n-1];
                    arr[n-1]=temp;
                    n--;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        if(n<3)
        {
            System.out.println("It is not possible");
        }
        else
        {
            System.out.println(arr[n-3]);
        }
    }
}