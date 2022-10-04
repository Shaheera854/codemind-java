import java.util.Scanner;
class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
			    System.out.print((char)((int)s.charAt(i)+32));
			}
			else
			{
			    System.out.print(s.charAt(i));
			}
		}
	}

}
