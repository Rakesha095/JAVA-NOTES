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
 int sum=0;
 int p=1;
 while(n>0)
 {
     d=n%10;
     n=n/10;
     c=c+1;
     sum=sum+d;
     p=p*d;
       System.out.print(d+" ");
 }
 System.out.println("");
System.out.println("Count: "+c);
System.out.println("sum: "+sum);
System.out.println("product;"+p);
if(sum==p)
{
    System.out.println("it is a spy number");
}
else
{
    System.out.println("it is not a spy number");
}
 
    }
}