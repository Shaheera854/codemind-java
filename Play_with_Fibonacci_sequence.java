import java.util.Scanner;
class Fibonacci
{
    public static void fibi(int n)
    {
        int a=0,b=1,c=1,i;
        if(n==1)
        {
            System.out.println(a);
        }
        else if(n==2)
        {
            System.out.println(a+" "+b);
        }
        else
        {
            System.out.print(a+" "+b+" ");
            for(i=0;i<n-2;i++)
            {
                System.out.print(c+" ");
                a=b;
                b=c;
                c=a+b;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        fibi(n);
    }
}