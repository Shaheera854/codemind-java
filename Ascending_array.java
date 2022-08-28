import java.util.Scanner;
class pal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0,t=0;
        n=sc.nextInt();
        int[] arr = new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
           if(arr[i]>=arr[i+1])
           {
               System.out.println("no");
               t=1;
               break;
           }
        }
        if(t==0)
        {
            System.out.println("yes");
        }
    }
}