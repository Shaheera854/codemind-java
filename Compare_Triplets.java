import java.util.Scanner;
class Triplets
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
        int b[]=new int[3];
        int c1=0,c2=0;
        for(int i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            if(a[i]>b[i])
            c1++;
            else if(b[i]>a[i])
            c2++;
        }
        System.out.print(c1+" "+c2);
    }
}