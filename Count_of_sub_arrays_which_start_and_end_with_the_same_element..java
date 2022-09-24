import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,c;
        n=sc.nextInt();
        c=n;
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}