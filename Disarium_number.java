import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int temp=n,i=0,s=0,c=0;
        int k=temp;
        while(k>0)
        {
            k=k/10;
            c++;
        }
        while(temp>0)
        {
            i=temp%10;
            s=s+(int)(Math.pow(i,c));
            temp=temp/10;
            c--;
        }
        if(s==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}