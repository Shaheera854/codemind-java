import java.util.Scanner;
class adamnum
{
    public static String is_adam(int n)
    {
        int rev=0,temp,sq1,sq2;
        sq1=n*n;
        temp=n;
        while(temp!=0)
        {
            rev=rev*10+temp%10;
            temp/=10;
        }
        sq2=rev*rev;
        temp=sq2;
        rev=0;
        while(temp!=0)
        {
            rev=rev*10+temp%10;
            temp/=10;
        }
        if(sq1==rev)
        {
            return "True";
        }
        else
        {
            return "False";
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        System.out.print(is_adam(n));
    }
}