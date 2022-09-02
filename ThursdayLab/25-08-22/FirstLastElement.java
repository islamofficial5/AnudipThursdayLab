//WAP to show the first and last digit of a number

package thursdaylab;
import java.util.Scanner;

public class FirstLastElement 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter digits:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Given digit is:" +number);
		int firstdigit=0;
		int lastdigit=0;
		
		lastdigit =number%10;
		System.out.println("Last digit is:" +lastdigit);
		
		while(number!=0)
		{
			firstdigit=number%10;
			number = number/10;
		}
		System.out.println("first digit is:" +firstdigit);
		
	}
}
