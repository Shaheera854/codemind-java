import java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i--)
        {
            for(int j=0;j<n;j++)
            {
                if(i>j)
                {
                    System.out.format("%c ",i+64);
                }
            }
            System.out.println();
        }
    }
}