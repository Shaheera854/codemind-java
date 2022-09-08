import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,t,i;
        t=sc.nextInt();
        for(i=0;i<t;i++)
        {
            m=sc.nextInt();
            n=sc.nextInt();
            System.out.println(m+n);
        }
    }
}