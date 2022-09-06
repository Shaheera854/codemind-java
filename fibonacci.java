import java.util.*;
class FibonacciExample1{  
public static void main(String args[])  
{    
    Scanner sc=new Scanner(System.in);
 int n1=0,n2=1,n3,i,c;    
 n3=sc.nextInt();
 c=n1+n2;
 //System.out.println("0 1");
for(i=1;i<=n3;i++)
 {    
  c=n1+n2;   
  System.out.format("%d ",n1);
  n1=n2;    
  n2=c;    
 }  
  
}}  