import java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<3)
        {
            System.out.println("The pattern is not possible");
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    if(i>=j)
                    {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
            for(int i=1;i<n;i++)
            {
                for(int j=1;j<n;j++)
                {
                    if(i<=j)
                    {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }
}