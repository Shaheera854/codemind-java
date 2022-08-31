import java.util.Scanner;
class revpal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,rev,temp;
        x=sc.nextInt();
        while(1==1)
        {
            rev=0;
            temp=x;
            while(temp!=0)
            {
                rev=rev*10+temp%10;
                temp/=10;
            }
            x+=rev;
            rev=0;
            temp=x;
            while(temp!=0)
            {
                rev=rev*10+temp%10;
                temp/=10;
            }
            if(x==rev)
            {
                System.out.print(x);
                break;
            }
        }
    }
}