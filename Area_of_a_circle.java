import java.util.Scanner;
class Triangle
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    float area,r;
    r=sc.nextInt();
    area=(float)(r*r*3.14);
    System.out.format("%.2f",area);
  }
}