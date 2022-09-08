import java.util.Scanner;
class absdiff
{
    public static int reverse(int m)
    {
        int rev=0;
        while(m!=0)
        {
            rev=rev*10+m%10;
            m/=10;
        }
        return rev;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x,i,n1=0,n2=0,temp,j,rev;
        n=sc.nextInt();
        x=sc.nextInt();
        temp=n;
        j=1;
        for(i=0;i<x;i++)
        {
            n1=(temp%10)*j+n1;
            j*=10;
            temp/=10;
        }
        rev=reverse(n);
        temp=rev;
        for(i=0;i<x;i++)
        {
            n2=n2*10+temp%10;
            temp/=10;
        }
        System.out.print(Math.abs(n1-n2));
    }
}