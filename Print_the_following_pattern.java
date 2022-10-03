import java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i--)
        {
            for(int j=n;j>0;j--)
            {
                if(j==i)
                {
                    System.out.print(j+" ");
                }
                else if(i+j==n+1)
                {
                    System.out.print(i+" ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}