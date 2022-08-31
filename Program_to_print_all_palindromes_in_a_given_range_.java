import java.util.Scanner;
class revpal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,temp,rev,i;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<=b;i++)
        {
            rev=0;
            temp=i;
            while(temp!=0)
            {
                rev=rev*10+temp%10;
                temp/=10;
            }
            if(i==rev)
            {
                System.out.print(i+" ");
            }
        }
    }
}