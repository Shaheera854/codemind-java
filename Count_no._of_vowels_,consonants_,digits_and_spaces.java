import java.util.Scanner;
class countofcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int v_c=0,c_c=0,dig=0,sym=0;
			String s1=sc.nextLine();
			String vowels="aeiouAEIOU";
			for(int i=0;i<s1.length();i++)
			{
				char ch=s1.charAt(i);
				if(Character.isLetter(ch))
				{
					if(vowels.contains(String.valueOf(ch)))
				    v_c++;
			        else
				    c_c++;
				}
				else if(Character.isDigit(ch))
					dig++;
				else if(Character.isSpace(ch))
					sym++;
			}
			System.out.println("Vowels: "+v_c);
			System.out.println("Consonants: "+c_c);
			System.out.println("Digits: "+dig);
			System.out.println("White spaces: "+sym);
			sc.close();
		}
	}

