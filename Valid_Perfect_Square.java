import java.util.Scanner;
class digits
{
    static String square(int n)
    {
        int i;
        for(i=1;i*i<=n;i++)
        {
            if(i*i==n)
            {
                return "True";
            }
        }
        return "False";
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,n,i;
        t=sc.nextInt();
        for(i=0;i<t;i++)
        {
           n=sc.nextInt();
           System.out.println(square(n));  
        }
    }
}