import java.util.Scanner;
class Balanced
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int count=0;
            for(int i=0;i<n;i++)
            {
                int a=0,b=0;
                for(int j=0;j<i;j++)
                {
                    a+=arr[j];
                }
                for(int j=i+1;j<n;j++)
                {
                    b+=arr[j];
                }
                if(a==b)
                count++;
            }
            if(count==0)
            System.out.println("NO");
            else
            System.out.println("YES");
        }
    }
}