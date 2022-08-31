import java.util.Scanner;
class digits
{
    static String pal(int n)
    {
        int rev,temp;
        rev=0;
        temp=n;
        while(temp!=0)
        {
            rev=rev*10+temp%10;
            temp/=10;
        }
        if(n==rev)
        {
            return "True";
        }
        return "False";
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,n,i;
        t=sc.nextInt();
        for(i=0;i<t;i++)
        {
           n=sc.nextInt();
           System.out.println(pal(n));  
        }
    }
}