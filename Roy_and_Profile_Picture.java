import java.util.Scanner;
class picture
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,n,w,h,i;
        l=sc.nextInt();
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            w=sc.nextInt();
            h=sc.nextInt();
            if(w<l || h<l)
            {
                System.out.println("UPLOAD ANOTHER");
            }
            else if(w==h)
            {
                System.out.println("ACCEPTED");
            }
            else
            {
                System.out.println("CROP IT");
            }
        }
    }
}