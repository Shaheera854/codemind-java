import java.util.Scanner;
class Reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1="";
        for(int i=s.length()-1;i>=0;i--)
        {
            s1+=s.charAt(i);
        }
        int i=0,j=0;
        while(i<s.length())
        {
            if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z'))
            {
                if((s1.charAt(j)>='A' && s1.charAt(j)<='Z') || (s1.charAt(j)>='a' && s1.charAt(j)<='z'))
                {
                    System.out.print(s1.charAt(j));
                }
                else
                {
                    i--;
                }
            }
            else
            {
                System.out.print(s.charAt(i));
                j--;
            }
            i++;
            j++;
        }
        
    }
}