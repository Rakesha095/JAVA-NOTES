import java.util.*;
class Main
{
public static void main(String[] args) 
    {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the first value:");
 int n = sc.nextInt();
 int m=n;
 int d=0;
 int  c=0;
 while(n>0)
 {
     d=n%10;
     n=n/10;
     if(d==0)
     {
     c=c+1;
     } 
 }

if(c>0)
{
    System.out.println("it is a duck number");
}
else
{
    System.out.println("it is not a duck number");
}
}
 
    }
