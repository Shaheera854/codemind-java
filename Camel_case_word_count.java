import java.util.Scanner;

class Strings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int i,c=0;
		for(i=0;i<s.length();i++)
		{
		    if(s.charAt(i)>='a' && s.charAt(i)<='z')
		    {
		        c++;
		        break;
		    }
		}
		for(i=i+1;i<s.length();i++)
		{
		    if(s.charAt(i)>='A' && s.charAt(i)<='Z')
		    c++;
		}
		System.out.println(c);
	}
}
