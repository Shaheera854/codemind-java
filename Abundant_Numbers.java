import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int s=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s+=i;
            }
        }
        if(s>n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}