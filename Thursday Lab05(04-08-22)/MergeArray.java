package thursdaylab;
import java.util.Scanner;

public class MergeArray 
{
	public static void main(String[] args)
	{
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[a.length+b.length];
		
		Scanner sc = new Scanner(System.in);
		int i,p=5;
		System.out.println("Enter 5 elements in the first array");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter 5 elements in the the second array");
		for(i=0;i<5;i++)
		{
			b[i]=sc.nextInt();
		}
		
		//assigning value from first array
		for(i=0;i<5;i++)
		{
			c[i]=a[i];
		}
		
		//assigning value from second array
		for(i=0;i<5;i++)
		{
			c[p++]=b[i];
		}
		//after merged, the array elements are;
		System.out.println("After merged the array elements are:");
		for(i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}
