import java.util.Scanner;
class countofcharacters {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int c=0,t=0,fl=0;
			String s1=sc.nextLine();
			for(int i=0;i<s1.length();i++)
			{
			    if(s1.charAt(0)==s1.charAt(i))
			    c++;
			}
			for(int i=0;i<s1.length();i++)
			{
			    int co=0;
			    for(int j=0;j<s1.length();j++)
			    {
			        if(s1.charAt(i)==s1.charAt(j))
			        co++;
			    }
			    if(co!=c)
			    {
			        if(t==1)
			        {
			            fl=1;
			            break;
			        }
			        if(co-1==c || co+1==c)
			        {
			            t=1;
			        }
			    }
			}
			if(fl==0)
			System.out.println("Valid String");
			else
			System.out.println("Not Valid");
		}
	}

