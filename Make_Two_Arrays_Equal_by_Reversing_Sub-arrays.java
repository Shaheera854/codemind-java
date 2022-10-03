import java.util.Scanner;
class Greatest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        for(int i=0;i<n2;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int t=0;
        int fl=0;
        for(int i=0;i<n1;i++)
        {
            t=0;
            for(int j=0;j<n2;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    t=1;
                    break;
                }
            }
            if(t==0)
            {
                fl=1;
                break;
            }
        }
        for(int i=0;i<n2;i++)
        {
            t=0;
            for(int j=0;j<n1;j++)
            {
                if(arr2[i]==arr1[j])
                {
                    t=1;
                    break;
                }
            }
            if(t==0)
            {
                fl=1;
                break;
            }
        }
        if(fl==0)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}