import java.util.Scanner;

class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		long UD=0,LR=0;
		for(int i=0;i<s.length();i++)
		{
		    if(s.charAt(i)=='U')
		    {
		        UD++;
		    }
		    else if(s.charAt(i)=='D')
		    {
		        UD--;
		    }
		    else if(s.charAt(i)=='L')
		    {
		        LR--;
		    }
		    else if(s.charAt(i)=='R')
		    {
		        LR++;
		    }
		}
		if(LR==0 && UD==0)
		System.out.println("True");
		else
		System.out.println("False");
	}
}
