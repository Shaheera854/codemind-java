import java.util.Scanner;
class min
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,b,i,j,min=0;
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<=b;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==arr[j])
                {
                    min+=i;
                    break;
                }
            }
        }
        System.out.println(min);
    }
}