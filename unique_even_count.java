import java.util.Scanner;
class oddsum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,s=0,c,j;
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c=0;
            for(j=i;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            if(c==1 && arr[i]%2==0)
            {
                s++;
            }
        }
        System.out.println(s);
    }
}