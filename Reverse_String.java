import java.util.Scanner;

class reversewordsinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String words[]=s1.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i]+" ");
		}
	}

}
