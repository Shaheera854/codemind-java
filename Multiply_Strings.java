import java.util.Scanner;
class Strings
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] s1=s.split(" ");
        long n1=Integer.valueOf(s1[0]);
        long n2=Integer.valueOf(s1[1]);
        System.out.println(n1*n2);
    }
}