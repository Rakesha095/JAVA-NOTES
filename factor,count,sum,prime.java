import java.util.*;
class Main
{
public static void main(String[] args) 
    {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the first value:");
 int a = sc.nextInt();
 int  c=0;
 int sum=0;
  System.out.println("Factor:");
 for(int i=1;i<=a;i++)
 {
  if(a%i==0)
  {
      System.out.println(i);
      c=c+1;
      sum=sum+i;
  }
 }
 
  
 System.out.println("Count:");
  System.out.println(c);
   System.out.println("sum:");
  System.out.println(sum);
  if(c<=2)
  {
       System.out.println("it is a prime");
  }
  else
  {
       System.out.println("not a primr");
  }
 
    }
}