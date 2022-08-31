import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int f;
        float c;
        f=sc.nextInt();
        c=(float)((f-32)/1.8);
        System.out.format("%.2f",c);
    }
}