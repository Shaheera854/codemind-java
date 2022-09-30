import java.util.Scanner;
class Max
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int j=0;j<c;j++)
        {
            int max=0;
            for(int i=0;i<r;i++)
            {
                if(max<arr[i][j])
                max=arr[i][j];
            }
            System.out.println(max);
        }
    }
}