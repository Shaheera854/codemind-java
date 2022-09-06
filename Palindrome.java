import java.util.*;
class Solution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int rev=0;
        int temp=n;
        while(temp!=0)
        {
            rev=rev*10+temp%10;
            temp/=10;
        }
        if(n==rev)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        

    }
}