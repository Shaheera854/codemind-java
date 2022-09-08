import java.util.Scanner;
class prime
{
    public static String is_prime(int n)
    {
        int i;
        if(n==0 || n==1)
        {
            return "not a prime";
        }
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return "not a prime";
            }
        }
        return "prime";
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        System.out.print(is_prime(n));
    }
}