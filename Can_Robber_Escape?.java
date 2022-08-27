import java.util.Scanner;
class robber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,odd=0,i;
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]%2==1)
            {
                odd+=1;
            }
        }
        if(odd>2)
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("YES");
        }
    }
}