import java.util.Scanner;

class Strings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int i,c=0,max=0;
		String vowels="aeiouAEIOU";
		for(i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(vowels.contains(String.valueOf(ch)))
			{
			    c++;
			}
			else
			{
			    if(max<c)
			    {
			        max=c;
			    }
			    c=0;
			}
		}
		if(max<c)
		{
		    max=c;
		}
		System.out.println(max);
	}
}
