import java.util.Scanner;
class reversewordsinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			for(int j=s1[i].length()-1;j>=0;j--)
			{
			    System.out.print(s1[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

}
