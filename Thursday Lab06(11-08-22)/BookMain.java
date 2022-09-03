package booksystem_thursdaylab;
import java.util.Scanner;

public class BookMain 
{
	public static void main(String[] args) 
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		BookService bservice = new BookService();
		
		do
		{
			System.out.println("~~Welcome to Book Management Syatem~~");
			System.out.println("========================================");
			
			System.out.println("Press 1.for create Book details\nPress " + 
									 "2.for get book details by id\nPress" +
									 " 3.for get all book details\nPress" + 
									 " 4.for quit");
			System.out.println("===========================================");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
					bservice.createBook();
					System.out.println("===========================================");
					break;
					
				case 2:
					bservice.getBookById();
					System.out.println("============================================");
					break;
					
				case 3:
					bservice.getAllBookDetails();
					System.out.println("============================================");
					break;
			}
		}
		while(choice!=4);
			System.out.println("Thanks for visit");
	}
}
