import java.util.Scanner;
class Missing
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
        int min=1;
        int t=0;
        int j=0;
        while(j<n)
        {
            t=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]==min)
                {
                   t=1;
                   break;
                }
            }
            if(t==0)
            {
                System.out.println(min);
                break;
            }
            min++;
            j++;
        }
        if(t==1)
        {
            System.out.println(min);
        }
    }
}