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
            int s=1;
            for(int i=1;i<n;i++)
            {
               if(arr[i-1]>arr[i])
               {
                   s++;
               }
            }
            System.out.println(s);
        }
    }
}