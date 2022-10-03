import java.util.Scanner;
class Students
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
        int m=sc.nextInt();
        int brr[]=new int[m];
        for(int i=0;i<m;i++)
        {
            brr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=k && k<=brr[i])
            {
                c++;
            }
        }
        System.out.println(c);
    }
}