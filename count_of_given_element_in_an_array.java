import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,ele,c=0;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        ele=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==ele)
            {
                c++;
            }
        }
        System.out.print(c);
    }
}