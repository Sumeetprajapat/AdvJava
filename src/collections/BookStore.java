package collections;

import java.util.ArrayList;

//1. Create a Book class with bookId, bookName and authorName.Create parameterized

//constructor to initialize the object. Create an ArrayList of type Book and store all book
//objects into collections and display all book details.

public class BookStore {

	public static void main(String[] args) {
		ArrayList<Book> bl = new ArrayList<>();

		bl.add(new Book(101, "book1", "auth1"));
		bl.add(new Book(102, "book2", "auth2"));
		bl.add(new Book(103, "book3", "auth3"));

		for (Book book : bl) {
			book.displayBook();
		}
	}
}
