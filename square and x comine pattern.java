import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int m=a;
    for(int i=1;i<=a;i++)
    {
     for(int j=1;j<=a;j++)
     {
         if(j==1||i==a-j+1 || i==1 || i==j || j==1||j==a ||i==a)
      {
      System.out.printf("*");
      }
      else
      {
          System.out.print(" ");
      }
     }
  System.out.println();
    }
  }
}