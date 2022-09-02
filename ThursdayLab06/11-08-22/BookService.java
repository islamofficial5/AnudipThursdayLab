package booksystem;
import java.util.Scanner;

public class BookService 
{
	static Book book[]=new Book[10];
	static Scanner sc = new Scanner(System.in);
	static int index=0;
	
	//create Book method
	public static void createBook()
	{	
		System.out.println("Enter Book Id:");
		int id=sc.nextInt();
		
		sc.nextLine();//it will consume the \n character
		
		System.out.println("Enter Book name:");
		String bname=sc.nextLine();
		
		System.out.println("Enter Book price:");
		double bprice=sc.nextDouble();
		
		book[index]=new Book(id, bname, bprice);
		index++;	//1 2
		System.out.println("Book details created successfully");
	}
	
	//get all book details
	public static void getAllBookDetails()
	{
		for(int i=0;i<index;i++)
		{
			System.out.println("Book Id: "+ book[i].getBookId());
			System.out.println("Book Name: "+ book[i].getBookName());
			System.out.println("Book Price: "+ book[i].getBookPrice());
		}
	}
	
	//get book details based on id
	public static void getBookById()
	{
		boolean f=false;
		System.out.println("Enter Id");
		int id=sc.nextInt();
		for(int i=0;i<index;i++)
		{
			if(id==book[i].getBookId())
			{
//				System.out.println(book[i]);
				System.out.println("Book Id: "+ book[i].getBookId());
				System.out.println("Book Name: "+ book[i].getBookName());
				System.out.println("Book Price: "+ book[i].getBookPrice());
				System.out.println("=======================================");
				f=true;
				break;
			}
		}
		if(f==false)
		System.out.println("Data not found");
		System.out.println("======================================");
	}
}
