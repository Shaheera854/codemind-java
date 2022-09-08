import java.util.Scanner;
class root
{
    public static String is_square(int n)
    {
        int i;
        for(i=0;i<=n/2;i++)
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
        int n;
        n=sc.nextInt();
        System.out.print(is_square(n));
    }
}