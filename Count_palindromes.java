import java.util.Scanner;
class pal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0,temp,rev;
        n=sc.nextInt();
        int[] arr = new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
           temp=arr[i];
           rev=0;
           while(temp!=0)
           {
               rev=rev*10+temp%10;
               temp/=10;
           }
           if(arr[i]==rev)
           {
               c++;
           }
        }
        System.out.println(c);
    }
}