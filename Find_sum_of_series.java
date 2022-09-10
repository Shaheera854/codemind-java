import java.util.Scanner;
class Sum
{
    public static float seriessum(int n)
    {
        float d,i,s=0;
        for(i=1;i<=n;i++)
        {
            d=1/i;
            s+=d;
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        System.out.format("%.2f",seriessum(n));
    }
}