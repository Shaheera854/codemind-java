import java.util.Scanner;
class Vowels
{
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
	public static char minVowel(String str)
	{
	    String vowels="aeiouAEIOU";
	    char min='|';
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(vowels.contains(String.valueOf(ch)))
			{
			    if(min>ch)
			    {
			        min=ch;
			    }
			}
		}
		return min;
	}
	public static char maxVowel(String str)
	{
	    String vowels="aeiouAEIOU";
	    char max='0';
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(vowels.contains(String.valueOf(ch)))
			{
			    if(max<ch)
			    {
			        max=ch;
			    }
			}
		}
		return max;
	}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String vowels="aeiou";
        String[] s1=s.split(" ");
        for(int i=0;i<s1.length;i++)
        {
            if(isPalindrome(s1[i]))
            {
                if(minVowel(s1[i])=='|')
                System.out.print("-1"+" ");
                else
                System.out.print(minVowel(s1[i])+" ");
                if(maxVowel(s1[i])=='0')
                {
                    System.out.print("-1");
                    System.out.println();
                }
                else
                {
                    System.out.print(maxVowel(s1[i]));
                    System.out.println();
                }
            }
        }
    }
}