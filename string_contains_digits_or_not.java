import java.util.Scanner;
class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int fl=0;
		    String s=sc.next();
		    for(int i=0;i<s.length();i++)
		    {
		        if(Character.isDigit(s.charAt(i)))
		        {
		            System.out.println("Yes");
		            fl=1;
		            break;
		        }
		    }
		    if(fl==0)
		    System.out.println("No");
		}
	}

}
