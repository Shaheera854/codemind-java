import java.util.Scanner;

class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=0,c=0;
		for(int i=0;i<s.length();i++)
		{
		    if(s.charAt(i)=='R')
		    n++;
		    else
		    n--;
		    if(n==0)
		    c++;
		}
		System.out.println(c);
	}
}
