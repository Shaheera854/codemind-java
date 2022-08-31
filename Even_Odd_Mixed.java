import java.util.Scanner;
class digits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,e=0,o=0,c=0;
        n=sc.nextInt();
        while(n!=0)
        {
            r=n%10;
            n/=10;
            if(r%2==0)
            {
                e++;
            }
            else
            {
                o++;
            }
            c++;
        }
        if(e==c)
        {
            System.out.print("Even");
        }
        else if(o==c)
        {
            System.out.print("Odd");
        }
        else
        {
            System.out.print("Mixed");
        }
    }
}