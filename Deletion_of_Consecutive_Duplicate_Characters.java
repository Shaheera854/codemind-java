import java.util.Scanner;
class Deletion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            String str=sc.next();
            int c=0;
            for(int i=0;i<str.length()-1;i++)
            {
                if(str.charAt(i)==str.charAt(i+1))
                c++;
            }
            System.out.println(c);
        }
    }
}