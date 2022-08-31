import java.util.Scanner;
class digits
{
    static int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,n,i;
        t=sc.nextInt();
        for(i=0;i<t;i++)
        {
           n=sc.nextInt();
           System.out.println(fact(n));  
        }
    }
}