import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int i=0,l=0;
        while(n>0)
        {
            i=n%10;
            if(l<i)
            {
                l=i;
            }
            n=n/10;
        }
        System.out.println(l);
    }
}