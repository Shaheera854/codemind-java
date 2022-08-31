import java.util.Scanner;
class factorial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,rev=0,temp;
        n=sc.nextInt();
        temp=n;
        while(temp!=0)
        {
            rev=rev*10+temp%10;
            temp/=10;
        }
        System.out.println(rev);
    }
}