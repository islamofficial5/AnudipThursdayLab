/*1.write a program to create Book management system.
create class name Book,and perform following actions:
Attributes:
bookid,bookName,bookPrice,authorName,library name(static),availability
method:
createBook() will store book details.(add at least 5 books).
displayBook()will display book details
displayBookByName(): display specific book details based on bookName
borrowBook(): borrow book if book is available based on bookName,then make availability status as "not available"*/

package thursdaylab;
import java.util.Scanner;

public class Book
{
	int bookId;
	float bookPrice;
	String bookName,authorName,libraryName;
	public void setData(int bookId,float bookPrice,String bookName,String authorName,String libraryName)
	{
		this.bookId=bookId;
		this.bookPrice=bookPrice;
		this.bookName=bookName;
		this.authorName=authorName;
		this.libraryName=libraryName;
	}
	public void createBook()
	{
		
	}
	public void displayBook()
	{
		
	}
	public void displayBookByName()
	{
		
	}
	public void borrowBook()
	{
		
	}
	public void getData()
	{
		this.displayBook();
		System.out.println("bookId:" +bookId+ "bookPrice:" +bookPrice+ "bookName:" +bookName+ "authorName:" +authorName+ "libraryName:" +libraryName);
	}
	public static void main(String[] args) 
	{
		Book bobj = new Book();
	}
}
