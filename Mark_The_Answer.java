import java.util.Scanner;
class Score
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0,s=0;
        for(int i=0;i<n;i++)
        {
            if(c==2)
            break;
            if(arr[i]<=x)
            s++;
            else
            c++;
        }
        System.out.println(s);
    }
}