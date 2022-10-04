import java.util.Scanner;
class PalindromeString {
	public static boolean isPalindrome(String str)
	{
		for(int i=0;i<str.length()/2;i++)
		{
			char ch1=str.charAt(i);
			char ch2=str.charAt(str.length()-i-1);
			if(ch1!=ch2)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    String s1=sc.next();
		    if(isPalindrome(s1))
		    {
		         System.out.print("YES ");
		         if(s1.length()%2==0)
		         System.out.print("EVEN
");
		         else
		         System.out.print("ODD
");
		     }
		     else
			 System.out.println("NO");
		}
	}
}
