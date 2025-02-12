import java.util.*;
class Main
{
public static void main(String[] args) 
    {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the first value:");
 int n = sc.nextInt();
 int  c=0;
 int m=n;
 int d=0;
 while(n>0)
 {
     d=n%10;
     c=c*10+d;
     n=n/10;

 }
System.out.println(c);
 if(m==c)
 {
     System.out.println("Planindrome");
 }
 else
 {
     System.out.println("NOt a palindrome");
 }
    }
}