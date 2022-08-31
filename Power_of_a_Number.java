import java.util.Scanner;
class digits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y,m;
        x=sc.nextInt();
        y=sc.nextInt();
        m=sc.nextInt();
        System.out.print((int)(Math.pow(x,y))%m);
    }
}