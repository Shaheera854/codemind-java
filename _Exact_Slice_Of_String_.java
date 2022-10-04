import java.util.Scanner;
class Strings
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=sc.nextInt();
        int u=sc.nextInt();
        for(int i=l;i<=u;i++)
        {
            System.out.print(s.charAt(i));
        }
    }
}