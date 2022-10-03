import java.util.Scanner;
class Max
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
        int max=0;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                c++;
            }
            else
            {
                if(max<c)
                {
                    max=c;
                    c=0;
                }
            }
        }
        if(max<c)
        {
            max=c;
        }
        System.out.println(max);
    }
}