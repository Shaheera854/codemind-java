import java.util.Scanner;
class pal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,temp,rev=0;
        n=sc.nextInt();
        temp=n;
        while(temp!=0)
        {
            rev=rev*10+temp%10;
            temp/=10;
        }
        if(n==rev)
        {
            System.out.println("2");
        }
        else
        {
            System.out.println("1");
        }
    }
}