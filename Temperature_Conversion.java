import java.util.Scanner;
class convert
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c;
        float f;
        c=sc.nextInt();
        f=(float)((c*1.8)+32);
        System.out.format("%.2f",f);
    }
}