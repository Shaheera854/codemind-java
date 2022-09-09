import java.util.Scanner;
class numbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,s=0;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            s+=i;
        }
        System.out.println(s);
    }
}