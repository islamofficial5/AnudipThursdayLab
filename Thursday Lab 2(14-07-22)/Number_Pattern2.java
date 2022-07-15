package thursdaylab;
import java.util.Scanner;

public class Number_Pattern2 
{
	public static void main(String[] args) 
	{
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows");
		int rows = sc.nextInt();
		
		for(i=1;i<=rows;i++)
		{
			for(j=rows;j>=i;j--)
			{
				System.out.print(j+ "");
			}
			System.out.println();
		}
	}
}
