import java.util.Scanner;
class automorphic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sq,temp,rev=0,c=0;
        n=sc.nextInt();
        temp=n;
        while(temp!=0)
        {
            c++;
            temp/=10;
        }
        sq=n*n;
        while(c!=0)
        {
            rev=rev*10+sq%10;
            sq/=10;
            c--;
        }
        temp=0;
        while(rev!=0)
        {
            temp=temp*10+rev%10;
            rev/=10;
        }
        if(n==temp)
        {
            System.out.print("Automorphic Number");
        }
        else
        {
            System.out.print("Not an Automorphic Number");
        }
    }
}