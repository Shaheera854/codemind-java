import java.util.Scanner;
class digits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s,c,temp;
        n=sc.nextInt();
        while(1==1)
        {
            s=0;
            c=0;
            temp=n;
            while(temp!=0)
            {
                s+=(temp%10);
                temp/=10;
                c++;
            }
            n=s;
            if(c==1)
            {
                System.out.print(n);
                break;
            }
        }
    }
}