import java.util.*;
class java
{
    public static void main(String AsD[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        int t = scan.nextInt();
        int m=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>m)
            {
                m=arr[i];
            }
        }
        int d=m-t;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=d)
            {
                System.out.print("True"+" ");
            }
            else
            {
                System.out.print("False"+" ");
            }
        }
    }
}