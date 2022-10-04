import java.util.*;
class Strings {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char max='a';
		for(int i=0;i<s.length();i++)
		{
		    if(max<s.charAt(i))
		    max=s.charAt(i);
		}
		System.out.println(max);
	}
}
