import java.util.*;
class FibonacciExample1{  
public static void main(String args[])  
{    
    Scanner sc=new Scanner(System.in);
 int n1=0,n2=1,n3,i,c;    
 n3=sc.nextInt();
 c=n1+n2;
while(c<n3)
 {    
  c=n1+n2;    
  n1=n2;    
  n2=c;    
 }  
 if(c==n3)
 {
     System.out.println("True");
 }
 else
 {
     System.out.println("False");
 }
  
}}  