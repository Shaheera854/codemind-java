import java.util.Scanner;
class pal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,i,c=0;
        n=sc.nextInt();
        k=sc.nextInt();
        int[] arr = new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
           if(arr[i]%k==0)
           {
               c++;
           }
        }
        System.out.println(c);
    }
}