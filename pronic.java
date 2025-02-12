import java.util.*;
class Main
{
public static void main(String[] args) 
    {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the first value:");
 int a = sc.nextInt();
  int con=0;
for(int i=0;i<=a;i++)
{
    con=i*(i+1);

if(con==a)
{
    System.out.println("yes");
    
}

else
{
    
    continue;
    
}
}
}
}