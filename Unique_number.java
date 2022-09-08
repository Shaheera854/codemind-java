import java.util.Scanner;
class unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,temp1,temp2,r1,r2,c,t=0;
        n=sc.nextInt();
        temp1=n;
        while(temp1!=0)
        {
            r1=temp1%10;
            temp1/=10;
            temp2=n;
            c=0;
            while(temp2!=0)
            {
                r2=temp2%10;
                temp2/=10;
                if(r1==r2)
                {
                    c++;
                }
            }
            if(c>1)
            {
                System.out.print("Not Unique Number");
                t=1;
                break;
            }
        }
        if(t==0)
        {
            System.out.print("Unique Number");
        }
    }
}