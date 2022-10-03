import java.util.Scanner;

class Strings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int i,c,sum=0;
		for(i=0;i<s.length();i++)
		{
		    if(s.charAt(i)>='0' && s.charAt(i)<='9')
		    {
		        c=(int)s.charAt(i)-48;
		        sum+=c;
		    }
		}
		System.out.println(sum);
	}
}
