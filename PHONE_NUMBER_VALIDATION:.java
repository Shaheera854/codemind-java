import java.util.Scanner;
class valid
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i;
        s=sc.nextLine();
        if(s.charAt(0)=='0' || s.length()!=10)
        {
            System.out.print("Invalid");
        }
        else
        {
            System.out.print("Valid");
        }
    }
}