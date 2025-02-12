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
		System.out.println("Solution:");
		int i;
		for(i=0;i<=a;i++)
		{
			if(i%b==0)
			{
			    continue;
			}
			System.out.println(i);
		}
		


	}
}