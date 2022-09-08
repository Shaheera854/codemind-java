import java.util.Scanner;
class amicable
{
    public static int num(int i)
    {
        int j,s=0;
        for(j=1;j<=i/2;j++)
        {
            if(i%j==0)
            {
                s+=j;
            }
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        if(num(n)==m && num(m)==n)
        {
            System.out.print("Amicable");
        }
        else
        {
            System.out.print("Not Amicable");
        }
    }
}