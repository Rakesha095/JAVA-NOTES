import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    for(int i=1;i<=a;i++)
    {
     for(int j=1;j<=a;j++)
     {
         if(j==1 || i==1 ||i==a || j==a)
      {
      System.out.printf("1");
      }
      else
      {
          System.out.print("0");
      }
     }
  System.out.println();
    }
  }
}