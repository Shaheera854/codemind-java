import java.util.Scanner;
class factorial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,temp,s=0,sq;
        n=sc.nextInt();
        sq=n*n;
        temp=sq;
        while(temp!=0)
        {
            r=temp%10;
            temp/=10;
            s+=r;
        }
        if(n==s)
        {
            System.out.print("Neon Number");
        }
        else
        {
           System.out.print("Not Neon Number");
        }
    }
}