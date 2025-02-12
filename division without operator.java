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
  int c=0;
 while(a>=b)
 {
   a=a-b;
   c=c+1;
 }
  System.out.println(c);
  
    }
}