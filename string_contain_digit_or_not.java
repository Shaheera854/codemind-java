import java.util.Scanner;
class Strings {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int c=0;
		for(int i=0;i<s.length();i++)
		{
		    if(Character.isDigit(s.charAt(i)))
		    c++;
		}
		if(c==0)
		System.out.println("Doesn't contain digit");
		else
		System.out.println("Contains "+c+" digit");
	}
}
