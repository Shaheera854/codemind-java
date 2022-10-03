import java.util.Scanner;

class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int len=s.length();
		int c=0;
		for(int i=0;i<s.length();i++)
		{
		    if(s.charAt(i)=='I')
		    {
		        System.out.print(c+" ");
		        c++;
		    }
		    if(s.charAt(i)=='D')
		    {
		        System.out.print(len+" ");
		        len--;
		    }
		}
		System.out.print(c+" ");
	}
}
