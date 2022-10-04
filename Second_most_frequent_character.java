import java.util.*;
class Strings {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int max=0;
		for(int i=0;i<s.length();i++)
		{
		    int c=0;
		    for(int j=0;j<s.length();j++)
		    {
		        if(s.charAt(i)==s.charAt(j))
		        c++;
		    }
		    if(max<c)
		    max=c;
		}
		int t=0;
		int max1=0;
		char ch='a';
		for(int i=0;i<s.length();i++)
		{
		    int c=0;
		    for(int j=0;j<s.length();j++)
		    {
		        if(s.charAt(i)==s.charAt(j))
		        c++;
		    }
		    if(max1<c && c!=max)
		    {
		        max1=c;
		        ch=s.charAt(i);
		    }
		}
		if(max1==0)
		System.out.println("-1");
		else
		System.out.println(ch);
	}
}
