import java.util.*;
class Main
{
public static void main(String[] args) 
    {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the first value:");
 int a = sc.nextInt();
 System.out.println("Enter the second value:");
 int b = sc.nextInt();
  System.out.println("Factor of "+a);
  int count=0;
  int hcf=0;
 for(int i=1;i<a;i++)
 {
  if(a%i==0)
  {
      System.out.println(i);
     
  }
 }
 System.out.println("Factor of "+b);
 for(int j=1;j<b;j++)
 {
  if(b%j==0)
  {
      System.out.println(j);
      
  }
 }

  for(int c = 1; c<= a ;c++) 
  {
         if( a%c == 0 && b%c == 0 )
        hcf = c;
      }
      System.out.println("HCF  is :"+hcf);
}
}